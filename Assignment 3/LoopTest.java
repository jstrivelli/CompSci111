public class LoopTest
{
	public static void main(String [] agrs)
	{
		int n = IO.readInt();
		
		for (int count = 1; count <= n; count++)
		{
			for (int j = 0; j < count - n; j++)
			{
				System.out.print(" ");
			}	
			for (int i = 0; i < count ; i++)
			{
				System.out.print("* ");
			}	
			System.out.println();
		}

	}
}