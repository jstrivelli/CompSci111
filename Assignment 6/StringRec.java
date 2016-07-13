public class StringRec
{
	// DO NOT DECLARE ANY VARIABLES HERE
	// (you may declare local variables inside methods)

	public static String decompress(String compressedText)
	{
		if(compressedText.length() == 0)
		{
			return "";
		}	
		if(compressedText.length() == 1)
		{
			return compressedText;
		}
		else
		{
			char firstP = compressedText.charAt(0);

			if(Character.isLetter(firstP))
			{
				return firstP + decompress(compressedText.substring(1));
			}	
			else if(Character.isDigit(firstP))
			{
				char secondP = compressedText.charAt(1);
				int num = (int) firstP - (int) '0';
				String letters = (new String(new char[num])).replace("\0", secondP + "");

				return letters + decompress(compressedText.substring(2));
			}
			else
				return decompress(compressedText.substring(1));	
		}
	}

	public static void main(String [] args)
	{
		 String input = IO.readString();
		 System.out.println(decompress(input));
	}
}
