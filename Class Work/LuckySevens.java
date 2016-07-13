public class LuckySevens
{
	public static void main (String [] args)
	{
		// the user inputs for the range of numbers they wish to proceed with
		System.out.println("What is your lowerbound?");
		int lowerBound = IO.readInt();
		System.out.println("What is your upperbound?");
		int upperBound = IO.readInt();
		int sevenCounter = 0;
		// proceeds if upperbound is greater than lowerbound
		if (upperBound >= lowerBound)
		{
			//going through every number between the range
			for(int a = lowerBound; a <= upperBound; a++)
			{
				//checks how many sevens are in a number
				int workingNum = a;
				while(workingNum != 0)
				{
					
					int workingDigit = workingNum % 10;
					// checks if the number in  a certain decimal place is a 7
					if(workingDigit == 7)
					sevenCounter++;
					workingNum /= 10;
				}
			}
			IO.outputIntAnswer(sevenCounter);
		}
		// lowerbound is larger the upperbound. Out of Range
		else
		{
			System.out.println("Your upperbound is less than your upperbound");
			IO.reportBadInput();	
		}		
	}
}

