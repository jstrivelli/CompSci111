import java.util.Scanner;
public class Reverse{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String reverse = "";
		for(int i = s.length() -1; i>=0; i--)
		{
			reverse +=s.charAt(i);
		}	
		System.out.println(reverse);
	}
}