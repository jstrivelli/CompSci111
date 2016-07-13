public class Recursive
{
	public static void main(String [] args)
	{
		int x = 0;
		while (x != -1)
		{
			x = IO.readInt();
			if(x != -1)
				specialK(x);
		}	
	}

	public static void specialK(int n)
	{
		//Base Case
		if(n == 1)
		{	
			System.out.println("K");
			return;
		}
		for(int i = 0; i<n; i++)
		{
				System.out.print(" ");
		}	
		System.out.println("K");
		specialK(n-1);
	}	
		//Recursive Call

}