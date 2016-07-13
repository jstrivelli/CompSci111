public class Compress
{
	public static void main(String [] agrs)
	{
		System.out.println("type in a sequence");
		String seq = IO.readString();
		seq = seq + " ";
		int count = 1;
		String newSeq = "";
		for(int a = 0; a < seq.length(); a++)
		{
			if(a != seq.length() -1)
			{
				if(seq.charAt(a) == seq.charAt(a + 1))
				{
					count++;
				}
				else
				{
					if(count != 1)
					{
					newSeq = newSeq + count + seq.charAt(a);
					}	
					else
					{
						newSeq = newSeq + seq.charAt(a);
					}	
				
					count = 1;
				}	
			}

			
		}	
		IO.outputStringAnswer(newSeq);
	}
}