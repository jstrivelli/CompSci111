// prints out every letter of a string on a different line and makes them all capital.
public class Class1
{
	public static void main(String [] args)
	{
		String s = IO.readString();
		// you can't write line 8 because strings are immutable 
		// s.toUpperCase();
		// Line 10 is acceptable because you simply referecne String s to another memory location
		s = s.toUpperCase();
		for(int i = 0; i <s.length(); i++)
		{
			System.out.println(Character.toUpperCase(s.charAt(i)));
		}	
	}
}