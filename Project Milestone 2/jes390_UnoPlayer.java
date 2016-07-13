
import java.util.List;

public class jes390_UnoPlayer implements UnoPlayer 
{

    public int play(List<Card> hand, Card upCard, Color calledColor, GameState state) 
    {
    	// I'm checking what color the up card is	
    	Color g = upCard.getColor();
    	//this is creating a color if the card does not have one
    	if(g == Color.NONE)
    		g = calledColor;
    	// this checks every card in my hand to see what card I could potentially play
    	for(int i = 0; i < hand.size(); i++)
        {
    		//specific card in the deck
    		Card playersCard = hand.get(i);
    		//I am checking to see if anyone has a high score first to manipulate that first. Its most important
    		for(int d = 0; d < state.getTotalScoreOfUpcomingPlayers().length; d++)
    		{
    			//if there score is 45000 or greater they are my target
    			if(state.getTotalScoreOfUpcomingPlayers()[d] <= 45000)
    			{
    				//making the player with highest score draw 4 cards and I choose color or I just choose the color
    				if(playersCard.getRank() == Rank.WILD_D4 || playersCard.getRank() == Rank.WILD)
    				{
    					callColor(hand);
    					return i;
    				}	
    			}	
    		}	
    		//I'm getting rid of wild draw 4 cards immediately so I don't have to take deduction of 50 points each hand
    		if(playersCard.getRank() == Rank.WILD_D4)
    		{
    			callColor(hand);
    			return i;	
    		}
    		//Ill play a reverse or skip card if the player whose turn it is next has 4 cards or less
            if(state.getNumCardsInHandsOfUpcomingPlayers()[0] == 4 || state.getNumCardsInHandsOfUpcomingPlayers()[2] == 4)
    		{
    			if(playersCard.getRank() == Rank.SKIP || playersCard.getRank() == Rank.REVERSE)
    				return i;
    		}	
        // I am running this loop to look at each players wild card
        for(int a = 0; a < 4; a++)
        {
   
        	//this is checking to see if the players before had a called color
        	if(state.getMostRecentColorCalledByUpcomingPlayers()[a] != Color.NONE)
        	{
        		// i want to switch the color that the person who drew wild summoned
        		if(playersCard.getRank() == Rank.WILD)
        		{
        			// so whatever color i have the most of in my hand is what i'm choosing for the color to be even if
        			//it is the same as the person above
        			callColor(hand);
        			return i;
        		}
        		// if i don't have a wild card i'm just going to put down the same color that is called.
        		else
        		{
        			if(state.getMostRecentColorCalledByUpcomingPlayers()[a] == playersCard.getColor())
            		{
            			//returning a same colored card
        				return i;
            		}	
        		}	
  
        	}	
        }
        //This strategy checks the pile of cards and determines which
        //number card to throw down depending on if I have the only remaining card with that number
        for(int b = 0; b < state.getPlayedCards().size(); b++)
        {
        	// so each position in the array is spot for each number card
        	int[] cardCounter = {0,0,0,0,0,0,0,0,0};
        	for(int c = 0; c < cardCounter.length; c++)
        	{
        		if(state.getPlayedCards().get(b).getRank() == Rank.NUMBER && state.getPlayedCards().get(b).getNumber() == c)
            		cardCounter[c-1]++;
        		if(cardCounter[c] == 3 && playersCard.getNumber() == c + 1)
        		{
        			return i;
        		}	
        			
        	}

        }
        
        
            //this is checking to see if the card has the same number as the upcard and return value
        	if(playersCard.getRank() == Rank.NUMBER)
            {
            	if(playersCard.getNumber() == upCard.getNumber())
            		return i;
            }	
            //this is checking to see if the card has the same colorand return value
        	if(playersCard.getColor() == g) 
                	 return i;
            //this is seeing if the card is wild return value
        	if(playersCard.getRank() == Rank.WILD)
            	return i;
            //this is checking if the card is Wild draw 4 return value
        	if(playersCard.getRank() == Rank.WILD_D4)
            	return i;
            //this is checking to see if the card is a special card return value
        	if(playersCard.getRank() == upCard.getRank() && playersCard.getRank() != Rank.NUMBER)
            	return i;
          
           
           
        }    
        //otherwise we return -1 to because there are no other playable cards
    	return -1;
    	
       
    	
    }
    
    
    
    
    
    
    
    // this method checks to see which color I have the most of in my hand. If i have that card the most, call that color
    // my objective is to minimize the amount of cards I have of one color	
    public Color callColor(List<Card> hand) 
    {
    	//an array of 4 for each color in the deck
    	int [] colorCounts = {0,0,0,0};
    	int maxIndex = 0;
    	//checking what the color is for each card in my hand
    	for(Card c: hand)
    	{
    		Color g = c.getColor();
    		if(g == Color.RED)
    			colorCounts[0]++;
    		else if(g == Color.YELLOW)
    			colorCounts[1]++;
    		else if(g == Color.GREEN)
    			colorCounts[2]++;
    		else if(g == Color.BLUE)
    			colorCounts[3]++;
    		
    	}
    	//this checks to see which is the maximum
    	for(int i =0; i <4; i++)
    	{
    		if(colorCounts[i] > colorCounts[maxIndex])
    		{
    			maxIndex =i;
    		}		
    	}
    	//returns the color that I have the most of in my hand for red, yellow, green, blue
    	if(maxIndex ==0)
    	{
    		return Color.RED;
    	}	
    	else if(maxIndex == 1)
    	{
    		return Color.YELLOW;
    	}
    	else if(maxIndex == 2)
    	{
    		return Color.GREEN;
    	}	
    	else
    		return Color.BLUE;
    }
 
}
