public class RightTriangle
{
	public static void main(String [] args)
	{
		// Initializing the variables
		double hypot = 0;
		double x = 0;
		double y = 0;
		double z = 0;
		// Asking the user the lengths of each side of a trianle in double terms
		System.out.println("First Side");
		x = IO.readInt();
		System.out.println("Second Side");
		y = IO.readInt();
		System.out.println("Thrid Side");
		z = IO.readInt();
		// the condition checks to seeif any of these numbers are negative
		if (x <= 0 || y <= 0 || z <= 0)
		{
			IO.reportBadInput();
			return;
		}	
		// This condition checks to see if any of the sides are greater than the sum of the other two sides. 
		// True would result in it not even being a triangle so its an error
		if (x + y < z || y + z < || x + z < y)
		{
			IO.reportBadInput();
			return;
		}	
		// This condition checks to see if x is the biggest double and then if it is
		// it checks to see if x is actually the hyp
		if (x > y && x > z)
		{
			if(Math.pow(x, 2) - (Math.pow(y, 2) + Math.pow(z, 2)) < 0.000000001)
			{
				System.out.println("Right triangle, hyp = " + x);
			}
			else 
			{
				System.out.println("Not a Right Triangle");
			}	
		}	
		// This condition checks to see if y is the biggest double and then if it is
		// it checks to see if y is actually the hyp
		else if (y > x && y > z)
		{
			if(Math.pow(y, 2) - (Math.pow(x, 2) + Math.pow(z, 2)) < 0.000000001)
			{
				System.out.println("Right triangle, hyp = " + y);
			}
			else 
			{
				System.out.println("Not a Right Triangle");
			}	
		}	
		// This condition checks to see if z is the biggest double and then if it is
		// it checks to see if z is actually the hyp
		else if (z > x && z > y)
		{
			if(Math.pow(z, 2) - (Math.pow(x, 2) + Math.pow(y, 2)) < 0.000000001) 
			{
				System.out.println("Right triangle, hyp = " + z);
			}
			else 
			{
				System.out.println("Not a Right Triangle");
			}	
		}
		// If it goes to else than this triangle is either an equalateral or iscolese triangle	
		else
		{
			System.out.println("Not a Right Triangle");
		}	

	}
}