public class PigLatin
{
	public static void main(String [] args)
	{
		System.out.println("Print a word that will terminate the program");
		String term = IO.readString();
		System.out.println("Type in a word");
		String word = IO.readString();
		while(word.equalsIgnoreCase(term) == false)
		{
			char firstLetter = Character.toLowerCase(word.charAt(0));
			if(Character.isDigit(firstLetter))
			{
				IO.reportBadInput();
			}
			else 
			{
				if(firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u' )
				{
					word = word + "way";
					IO.outputStringAnswer(word);
				}
				else
				{
					word = word.substring(1) + firstLetter + "ay" ;
					Character.toUpperCase(word.charAt(0));
					IO.outputStringAnswer(word);
				}	
			}
			System.out.println("Type in a word");
			word = IO.readString();
		}	
	}
}
