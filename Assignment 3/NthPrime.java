public class NthPrime
{

	// main will ask the user what prime number they are looking for and gives an output,
	// it terminates if the user input is the same value as the terminated number
	public static void main(String [] args)
	{
		double timeExecuted = 0;
		//primeNumber is the prime number in the nth term.
		int primeNumber;
		// nPrime is the nth term the user enters
		int nPrime = 0;
		System.out.println("Type an integer that will terminate the program");
		int terminate = IO.readInt();
		long startTime = System.nanoTime();
		//terminates program once user enters terminate value
		while(nPrime != terminate)
		{
			System.out.printf("TERMINATE #: %d \n", terminate);
			System.out.println("Hello pick out the n'th prime number? (Integer and positive)");
			nPrime = IO.readInt();
			// a prime number has to be postive
			if(nPrime > 0)
			{
				primeNumber = findNumber(nPrime);
				IO.outputIntAnswer(primeNumber);
			}	
			//if the user enters terminate it terminates the program
			else if(nPrime == terminate)
			{
				
				return;
			}	
			// if the input is 0 or smaller than it results in an error.
			else
			{
				IO.reportBadInput();
			}	

		}	

	}
	
	//finds the nth Prime Numbers inputed by the user in the main
	public static int findNumber(int a)
	{
		//the first prime number is 2, so we initalize it to 2
		int primeNum = 2;
		// primeCheck is declared 3 because we already know the first prime number
		int primeCheck = 3;
		//primeNumCount is the nth value count
		int primeNumCount = 1;
		//this loop finds the nth prime number
		while(primeNumCount < a)
		{
			//if primeCheck is true that we know that a prime number is the tested value which increases the nth sequence by 1
			if(isPrime(primeCheck) == true)
			{
				primeNum = primeCheck;
				primeNumCount++;
			}
			//this increments by 1 to continue finding a prime number
			primeCheck++;
		}	
		// returns an integer which is the nth Prime Number
		return primeNum;
	}


	// This subroutine will check to see if a number is prime using a boolean expression
	public static boolean isPrime(int testing)
	{	 
		//this loop checks to see if a number is prime
		for(int i = 2; i <= (int)Math.sqrt((double)testing); i++)
		{
			//if prime number remainder of i is = 0 than the tested number is not a prime number.
			if(testing % i == 0)
			{
				return false;
			}		
		}	
		//if all the checks are not divisible than we know the number is prime
		return true;
	}

}
