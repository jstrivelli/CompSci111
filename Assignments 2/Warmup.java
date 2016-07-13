public class Warmup
{
	public static void main(String [] args)
	{
		//instializing variables
		int a = 0;
		int b = 0; 
		//printing directions for the user
		System.out.println("I will add find the sum and average of two numbers, so \n  Input an integer number.");
		//user inputs first number
		a = IO.readInt();
		System.out.println("You typed: " + a);
		//process is repeated for the second number
		System.out.println(" Input a second integer number");
		b = IO.readInt();
		// processing information to get the sum and the mean(average) of the two numbers
		double c = (double) a + b;
		double d = (double) a/b; 
		// printing out Information in IO form to be graded
		IO.outputDoubleAnswer(c);
		IO.outputDoubleAnswer(d);
	}

}