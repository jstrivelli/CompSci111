public class SmallestString
{
	public static void main(String [] agrs)
	{
		/*do
		{
			String a = "";
			String b = IO.readString();
			if (c.compareTo(b) < 0)
			{
				String d = b;
			}	
			String c = b;	
		}
		while(b.equals(a)== false)
		System.out.println(d);*/
		String s = IO.readString();
		String result = "";
		String min = IO.readString();
		String read = min;
		// calculate the lexicographic first word
		while(read.length() != 0)
		{
			read = IO.readString();
			if(read.length() == 0)
				break;	
			if(read.compareTo(min) < 0)
				min = read;
		}	
		System.out.println("Min: " + min);
	}
}

