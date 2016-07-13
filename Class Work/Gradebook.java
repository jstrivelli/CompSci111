public class Gradebook
{
	public static double getStudentAverage(double[][] gb, String[] names, String name)
	{
		int found = -1;
		double sum = 0;
		for(int i =0; i < names.length; i++)
		{
			if(name.equals(names[i]))
			{
				found = i;
				break;
			}	
		}
		if(found == -1)
		{
			return -1
		}

		for(int j = 0; j < gb[found].length; j++)
		{
			sum += gb[found][j];
		}
		return sum/gb[found].length;	
	}
	public static void printGradebook(double [][] gb, String[] names)
	{
		for(int i = 0; i < names.length; i++)
		{
			System.out.print(names[i]);
			for(int a = 0; a < gb[i].length; a++)
			{
				System.out.print(gb[i][a] + ",");
			}	
			System.out.println();
		}	
	}
}