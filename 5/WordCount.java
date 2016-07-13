public class WordCount
{
	public static void main(String [] args)
	{
		int minWord = 0;
		String sentence = "";
		do
		{
			System.out.println("What is the minimum letter count? Type -1 to escape");
			minWord = IO.readInt();
			if(minWord <= -2)
			{
				IO.reportBadInput();
			}
			else if(minWord == -1)
			{
				break;
			}	
			System.out.println("Type Sentence or press enter to escape.");
			sentence = IO.readString();
			int result = wordCount(minWord, sentence);
			IO.outputIntAnswer(result);
		} while(!sentence.equals(""));
	}
	public static int wordCount(int min, String sent)
	{
		int wordCount = 0;
		String check;
		int length = 0;
		while(sent.length() > min)
		{
				if(sent.indexOf(' ') > -1)
				{
						check = sent.substring(0, sent.indexOf(' '));
						length = check.length();
						sent = sent.substring(sent.indexOf(' ') +1);
				}	
				else
				{
					length = sent.length();
					sent = "";
				}	

				if(length >= min)
					wordCount++;

		}	
		return wordCount;
	}
}