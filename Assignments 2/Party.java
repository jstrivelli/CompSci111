/*
	Author - Jesse Strivelli
	Assignment- #2. Problem #3 
	Ask the user for the following information, in this order:

	the number of people attending the party
	the number of slices of pizza each person should be able to eat
	the number of cans of soda each person should be able to drink
	the cost of a pizza pie
	the number of slices in a pizza pie
	the cost of a case of soda
	the number of cans in a case of soda
	Compute the total cost of the pizza and soda you will need to buy. Do not buy more than you need 
	to in order to supply each partygoer with the desired number of pizza slices and soda cans.
*/
public class Party
{
	public static void main(String [] args)
	{
		// instializing the variables
		int attendance = 0;
		int slicesOfPizza = 0;
		int cansOfSoda = 0;
		double costOfPie = 0;
		int numSlicesInPie = 0;
		double costOfSodaCase = 0;
		int numCansCase = 0;
		double totalCostOfPizza = 0;
		double totalCostOfSoda = 0;
		double total = 0;
		// asking the user how many people are attending party
		System.out.println("How many people are coming to the party? (Integer)");
		attendance = IO.readInt();
		// attendance is an integer response. proceed
		if(attendance == (int)attendance && attendance > 0)
		{
			//asking the host how many slices of pizza each person is eating during the party
			System.out.println("How many slices of pizza is each person eating at this party? (Integer)");
			slicesOfPizza = IO.readInt();
			//slizes of pizza is an integer proceed
			if(slicesOfPizza == (int)slicesOfPizza && slicesOfPizza > 0)
			{
				// asking the host the number of cans of soda each person will drink
				System.out.println("How many cans of soda will each person drink at this party? (Integer)");
				cansOfSoda = IO.readInt();
				//cans of soda drank is an integer. proceed
				if(cansOfSoda == (int)cansOfSoda && cansOfSoda > 0)
				{
					//asking the host the cost of a pizza pie
					System.out.println("What is the cost of a pizza pie?");
					costOfPie = IO.readDouble();
					// costOfPie is a double or integer. Proceed
					if (costOfPie == (double)costOfPie && costOfPie > 0)
					{
						//asking the host how many slices are in a pie
						System.out.println("How many slices of Pizza are in each Pizza Pie? (Integer)");
						numSlicesInPie = IO.readInt();
						// number of slices is an integer so proceed
						if(numSlicesInPie == (int)numSlicesInPie && numSlicesInPie > 0)  
						{
							//asking the user the cost of a case of soda
							System.out.println("What is the cost of a case of soda?");
							costOfSodaCase = IO.readDouble();
							//cost of case is a number so proceed
							if(costOfSodaCase == (double)costOfSodaCase && costOfSodaCase > 0)
							{
								//asking the user how many cans of soda to a case
								System.out.println("How many cans of soda are in each case? (Integer)");
								numCansCase = IO.readInt();
								//number of cans in each case is an integer so proceed
								if(numCansCase == (int)numCansCase && numCansCase > 0)
								{
									//computing the total cost of the pizza
									totalCostOfPizza = attendance * slicesOfPizza / numSlicesInPie * costOfPie;
									// if there is extra slices needed after all these pies then host needs another pie
									if((attendance * slicesOfPizza) % numSlicesInPie != 0)
										totalCostOfPizza = totalCostOfPizza + costOfPie;
									//computing the total cost of soda
									totalCostOfSoda = attendance * cansOfSoda / numCansCase * costOfSodaCase;
									// if there is extra cans needed after al these cases then the host needs another case of soda
									if((attendance * cansOfSoda) % numCansCase != 0)
										totalCostOfSoda = totalCostOfSoda + costOfSodaCase;
									// computing and printing out the total cost for the party
									total = totalCostOfPizza + totalCostOfSoda;
									System.out.println("The total cost of your party is $" + total);
									IO.outputDoubleAnswer(total);

								}	
								//number of cans in each case is not an integer and results in an error
								else
								{
									System.out.println("Number of cans to a case was not an integer.");
									IO.reportBadInput();
								}	
							}	
							// cost of soda case was not a number so therefor it is an error
							else
							{
								System.out.println("The cost of soda case was not a number.");
								IO.reportBadInput();
							}	
						}
						// number of slices was not an integer
						else
						{
							System.out.println("The number of slices in a pie was not an integer.");
							IO.reportBadInput();
						}	

					}	
					// costOfPie is not an integer or double therefor it is an error
					else
					{
						System.out.println("The cost of pie is not a number");
						IO.reportBadInput();
					}	
				}	
				// cans of soda is not an integer therefor it is an error
				else
				{
					System.out.println("Cans of soda each person is drinking wasn not typed as an integer");
					IO.reportBadInput();
				}	
			}
			// the number of slices each person is eating is not an integer therefor error
			else
			{
				System.out.println("Number of slices was not an integer");
				IO.reportBadInput();
			}	
		}
		//attendance is not an integer therefor its an error
		else
		{
			System.out.println("Attendance was not an interger");
			IO.reportBadInput();
		}	
	}
}