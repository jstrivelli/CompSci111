public class SmallLargest
{
	public static void main(String [] args)
	{
		// declaring variables to determine the maximum and minimum numbers in a sequence inputed all by a user
		double max,min,terminate,sequence;
		System.out.println("input a number that terminates the program");
		terminate = IO.readDouble();
		System.out.println("input numbers for the sequence,to terminate enter: " + terminate);
		//intializing max, min, and sequence
		sequence = IO.readDouble();
		max = 0;
		min = 0;
		//using a loop to find the max, min and also to check if the sequence typed is the terminate
		while(sequence != terminate)
		{
			// finds the maximum number in the sequences inputed by the user
			if(sequence > max)
			{
				max = sequence;
			}
			// finds the minimum number in the sequecne inputed by the user	
			if(sequence < min)
			{
				min = sequence;
			}				
			// Asks user to input a number for the sequence
			sequence = IO.readDouble();
		}	
		// outputs the minimum and maximum number
		IO.outputDoubleAnswer(max);
		IO.outputDoubleAnswer(min);
	}
}