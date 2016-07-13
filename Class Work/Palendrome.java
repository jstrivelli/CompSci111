public class Palendrome
{
	public static void main(String [] args)
	{
		boolean isPalendrome = true;
		String num;
		String terminate = IO.readString();
		do
		{
			System.out.println("Type in any string to check if its a palendrome");
			num = IO.readString();
			for(int a = 0; a < num.length()/2; a++)
			{
				if(num.charAt(a) != num.charAt(num.length()- a))
				{
				isPalendrome = false;
				}	
			}	
			IO.outputBooleanAnswer(isPalendrome);
		} while(num.equals(terminate) == false);
	}
}