import java.util.Scanner;
import java.util.Random;
public class Blackjack
{
	public static void main(String [] args)
	{
		Card dealer = new Card();
		Card player = new Card();
		Scanner in = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		int bet = 0;
		int playerChips = 1000;
		Random ran = new Random();
		int play = 1;
		int total= 0;
		int sum = 0;
		int deal = 1;
		int answer = 1;
		int dealerRank = 0;
		int dealerHit1 = 0;
		String dealerSuit;
		String dealerSuit1;
		String facevalue;
		while (playerChips > 0 && playerChips < 10000 && answer == 1)
		{
			System.out.println("How much do you wish to bet");
			bet = in.nextInt();
			dealerHit1 = ran.nextInt(52);
			dealerSuit1 = dealer.getSuit(dealerHit1);
			dealerRank = dealer.getRank(dealerHit1);
			sum = dealerRank;
			System.out.println("Dealer's First Card: " + dealerRank + dealerSuit1);
			System.out.println("You just bet " + bet + " CHIPS");
			while(play == 1)
			{
				if (total <= 21)
				{
					int draw = ran.nextInt(52);
					String playerSuit = player.getSuit(draw);
					int playerRank = player.getRank(draw);
					if(playerRank <= 10 && playerRank != 1)
					{
						System.out.println(playerRank + playerSuit);
						total = playerRank + total;
					}
					else if(playerRank == 11)
					{
						facevalue = "Jack";
						playerRank = 10;
						System.out.println(facevalue + playerSuit);
						if(total == 1)
						{
							total = 21;
						}
						else
							total = playerRank + total;
					}
					else if(playerRank == 12)
					{
						facevalue = "Queen";
						playerRank = 10;
						System.out.println(facevalue + playerSuit);
						if(total == 1)
						{
							total = 21;
						}
						else
							total = playerRank + total;
					}
					else if(playerRank == 1)
					{
						facevalue = "Ace";
						System.out.println(facevalue + playerSuit);
						if(total == 10)
						{
							total = 21;
						}
						else
							total = playerRank + total;
					}
					else
					{
						facevalue = "King";
						playerRank = 10;
						System.out.println(facevalue + playerSuit);
						total = playerRank + total;
					}
					System.out.println("Your total: " + total);
					System.out.println(" Player:  Hit (Press 1) or Stay (Any other Number)? ");
					play = scan1.nextInt();
				}
				else
				{
					System.out.println("You went over");
					play++;
				}	

			}
			while (deal == 1)
			{
				if (sum<=21)
				{
					int hit =ran.nextInt(52);
					dealerRank = dealer.getRank(hit);
				 	dealerSuit = dealer.getSuit(hit);
					sum = dealerRank + sum;
					if(dealerRank <= 10 && dealerRank != 1)
					{
						 System.out.println(dealerRank + dealerSuit);
					}
					else if(dealerRank == 11)
					{
						dealerRank = 10;
						facevalue = "Jack";
						System.out.println(facevalue + dealerSuit);
						if(sum == 1)
						{
							sum = 21;
						}
						else
							sum = dealerRank + sum;
					}
					else if(dealerRank == 1)
					{
						facevalue = "Ace";
						System.out.println(facevalue + dealerSuit);
						if(sum == 10)
						{
							sum = 21;
						}
						else
							sum = dealerRank + sum;
					}
					else if(dealerRank == 12)
					{
						dealerRank = 10;
						facevalue = "Queen";
						System.out.println(facevalue + dealerSuit);
						if(sum == 1)
						{
							sum = 21;
						}
						else
							sum = dealerRank + sum;
					}
					else
					{
						dealerRank = 10;
						facevalue = "King";
						System.out.println(facevalue + dealerSuit);
						if(sum == 1)
						{
							sum = 21;
						}
						else
							sum = dealerRank + sum;
					}
					if(sum >= 17)
					{
						deal++;
					}
					System.out.println("Dealer's Total: " + sum);
				}
				else
					deal++;

			}
			if (total <= 21 && sum <= 21)
			{
				if(total > sum)
				{
					playerChips = playerChips + bet;
					System.out.println("Nice Job!");
					System.out.println("Chips: " + playerChips);
				}
				else
				{
					playerChips = playerChips - bet;
					System.out.println("Dealer won.");
					System.out.println("Chips : " + playerChips);
				}
			}
			else if (sum <= 21 && total <= 21)
			{
				if(sum > total)
				{
					playerChips = playerChips - bet;
					System.out.println("Dealer won.");
					System.out.println("Chips : " + playerChips);
				}
				else
				{
					playerChips = playerChips + bet;
					System.out.println("Nice Job!");
					System.out.println("Chips : " + playerChips);
				}
			}
			else if (sum > 21 && total > 21)
			{
				System.out.println("You and dealer went over 21 its a draw");
				System.out.println(playerChips);
			}
			else if(sum > 21 && total <= 21)
			{
				playerChips = playerChips + bet;
				System.out.println("Nice Job! Dealer went over");
				System.out.println("Chips : " + playerChips);
				
			}
			else if(total > 21 && sum <= 21)
			{
				playerChips = playerChips - bet;
				System.out.println("Dealer won. You went over");
				System.out.println("Chips : " + playerChips);
				
			}	
			System.out.println("Play another hand (Press 1), if not (any other number)");
			answer = scan2.nextInt();
			if (answer == 1)
			{
				play = play -1;
				deal = deal -1;
				total = total - total;
				sum = sum - sum;
			}
		}
		if (playerChips >= 10000)
		{
			System.out.println("You are a master at BlackJack and just swept the dealers table from all their money!!!");
		}
		if (playerChips < 0)
		{
			System.out.println("You went bankrupt");
		}
		if (answer != 1)
		{
			System.out.print("Goodbye!");
		}	
	}
}


