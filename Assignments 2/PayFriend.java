/*
	Author: Jesse Strivelli
	Assignment: #2, Problem #2
	You work for the a payment processing service called PayFriend. PayFriend charges money receivers the following fees

	The first $100 has a flat fee of $5.
	Payments over $100 (but under $1000) have a fee of 3% or $6, whichever is higher.
	Payments $1,000 (but under $10,000)  and over have a fee of 1% or $15, whichever is higher.
	Payments $10,000 and over are subject to fees as follows:
	The first $10,000 have a fee of 1%
	The next $5,000 have an additional fee of 2%
	Anything more will demand an additional fee of 3%
	For example, an payment of $40,000 would be subject to $950 fee: 1% on the first $10,000 ($100 fee), 2% on the next $5,000 ($100 fee), and 3% on the last $25,000 ($750 tax).

	Ask the user for their payment amount (integer) and compute the amount of the fee that they owe (real number).
*/
public class PayFriend
{
	public static void main(String [] args)
	{
		// instializing the variables
		double price = 0;
		double payment = 0;
		// asking the user how much his payment is.
		System.out.println("Hello how much is your payment? (Disregard the cents)");
		payment = IO.readInt();
		// Condition checks to see if users payment is double 
		if(payment == (int)payment && payment > 0)
		{
			//The first $100 has a flat fee of $5
			if(payment < 100)
			{
				price = 5;
			}
			// payment is over $100 but under $1000. have a fee of 3% of $6, whichever is higher.
			else if (payment >= 100 && payment < 1000)
			{
				// 3% of payment is lower than $6 therefor the fee is 6 dollars
				if((payment * .03) < 6)
				{
					price = 6;
				}	
				// 3% of payment is higher than $6 therefor the fee is 3% of payment
				else
				{
					price =  payment * .03;
				}
			}
			// Payments $1,000 (but under $10,000)  and over have a fee of 1% or $15, whichever is higher. 
			else if (payment >= 1000 && payment < 10000)
			{
				// 1% of payment is lower than $15 therefor the fee is 15 dollars
				if((payment * .01) < 15)
				{
					price = 15;
				}
				// 1% of payment is higher than $15 therefor the fee is 1%
				else
				{
					price = payment * .01;
				}	
			}
			/*
				Payments $10,000 and over are subject to fees as follows:
				The first $10,000 have a fee of 1%
				The next $5,000 have an additional fee of 2%
				Anything more will demand an additional fee of 3%
			*/
			else if (payment >= 10000)
			{
				//The first $10,000 have a fee of 1%
				price = 10000 * .01;
				// The first $10,000 have a fee of 1%
				// The next $5,000 have an additional fee of 2%
				if (payment > 10000 && payment < 15000)
				{
					price = (payment - 10000) * .02 + price;
				}
				// The first $10,000 have a fee of 1%
				// The next $5,000 have an additional fee of 2% (5000 * .02 = 100 (Thats Automatic))
				// Anything more will demand an additional fee of 3%
				else if (payment > 15000)
				{
					price = (payment - 15000) * .03 + price + 100;
				}		
			}
			// Prints the total fee
			IO.outputDoubleAnswer(price);	
		}	
		// Payment is not an integer number and results in an error
		else
		{
			System.out.println("Payment was not an integer");
			IO.reportBadInput();
		}	

			


	}
}