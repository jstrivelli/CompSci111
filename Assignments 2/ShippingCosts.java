/* 
 *	Author: Jesse Strivelli
 * 	Assignment: #2, Problem #1
 *	Suppose that there is a website Quarter.com where you can buy used items (at up to half price!).  The Standard Delivery 
 *	shipping and handling charge is $3.99 per shipment (not per item) plus $0.99 per pound of the shipment.  Customers may 
 *	choose Superfast Delivery instead, for $12.99 per shipment (not per item) plus $4.99 per pound of the shipment. The website 
 *	is running a promotion whereby customers receive free Standard Delivery shipping if they buy more than 10 items.

 *	Ask the user for the number of items they wish to buy (integer) and whether they want Superfast Delivery (boolean: true means Superfast, 
 *	false means Standard), and then the total weight of the shipment in that order. Then compute the total cost of their order (real number).
*/

public class ShippingCosts
{
	public static void main(String [] args)
	{
		// intialzing the variables
		int numItems = 0;
		String superFast;
		double price = 0;
		double weight = 0;
		double weightPerPound = 0;
		// Asking the user how many items he wants to buy
		System.out.println("How many Items do you wish to buy?"); 
		// Reading the users response about numbers of items
		numItems = IO.readInt();
		// the number of items the user typed is a postive integer
		if (numItems == (int)numItems && numItems > 0)
		{
			// Asking the user if they want a fast delivery
			System.out.println("Do you want a superfast delivery? Answer: (Yes/No),");
			superFast = IO.readString();
			// The user wants a superfast delivery
			if (superFast.equalsIgnoreCase("Yes"))
			{
				price = 12.99;
				weightPerPound = 4.99;
				System.out.println("What is the weight of your items all together?");
				weight = IO.readDouble();
				price = price + weight * weightPerPound;
				IO.outputDoubleAnswer(price);
			}	
			//The user doesn't want a superfast delivery and has less than 10 items
			else if (superFast.equalsIgnoreCase("No"))
			{	
				//the number of items is less than 10 so there is a fee to the standard delivery
				if(numItems < 10)
				{
					price = 3.99;
					weightPerPound = 0.99;
					System.out.println("What is the weight of the items all together?");
					weight = IO.readDouble();
					price = price + weight * weightPerPound;
					IO.outputDoubleAnswer(price);
				}	
				//the number of items is greater than 10 and the standard delivery is free due to promotion
				else
				{
					System.out.println("Due to promotion of site, the delivery is free");
					IO.outputDoubleAnswer(price);
				}	
			}	
			//error with answer about superfast delivery. Wasn't Yes or No
			else
			{
				System.out.println("Error with Answer.");
				IO.reportBadInput();
			}	
		}
		// The number of items is not an integer value or not a positive value of items
		else
		{
			System.out.println("Error with input");
			IO.reportBadInput();
		}	

	}
}

public class Derivatives
{

	public static void main(String [] args)
	{
		int functionX = 
	}
}