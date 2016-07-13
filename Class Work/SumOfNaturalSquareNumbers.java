public class SumOfNaturalSquareNumbers
{
	public static void main(String [] args)
	{
		double sum = 0;
		for(int a = 1; a <= 100; a++)
		{
			sum = Math.pow(a,2) + sum;
		} 
		double sum2 = Math.sqrt(sum, 2);
		double dif = sum - sum2;
		System.out.println(dif);
	}
}