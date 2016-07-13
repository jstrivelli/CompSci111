
public class Card
{
	private int [] card = new int [52];
	public Card()
	{
		for (int cardNum = 0; cardNum <card.length; cardNum++)
		{
			card[cardNum] = cardNum+1;
		}
	}
	public String getSuit(int n)
	{
		String suit;
		int num = card[n -1] / 13;
		if (num == 1)
		{
			suit = " of Diamonds";
		}	
		else if(num == 2)
		{
			suit =" of Clubs";
		}	
		else if(num == 3)
		{
			suit = " of Hearts";
		}	
		else
		{
			suit = " of Spades";
		}
		return suit;
		
	}
	public int getRank(int n)
	{
		int num = card[n -1];
		if (num >= 4)
		{
			num =num/4;
		}
		else
		{
			num =num % 4;
		}
		return num;
	}
}


