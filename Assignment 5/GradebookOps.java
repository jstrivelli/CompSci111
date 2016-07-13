public class GradebookOps
{	
	private static double total = 0.0;
	
	public static int findStudent(String studentName, String[] allStudentNames, boolean alphabetical)
	{
		int s = allStudentNames.length;
		for(int i = 0; i < s; i++)
		{
			if(studentName.equalsIgnoreCase(allStudentNames[i]))
			{
				return i;
			}	
		}	
		return -1;
	}
	
	public static double computeGrade(int studentIndex, int[][] scoreTable, int[] itemPointValues)
	{
		double gradeTotal= 0.0;
		double total = 0.0;
		for(int i : scoreTable[studentIndex])
		{
			gradeTotal += i;
		}
		for(int a: itemPointValues)
		{
			total += a;
		}	
		return gradeTotal/total * 100;
	}
	
	public static double[] computeAllGrades(int[][] scoreTable, int[] itemPointValues)
	{
		double [] grades = new double[scoreTable.length];
		for(int i = 0; i < scoreTable.length; i++)
		{
			grades[i] = computeGrade(i, scoreTable, itemPointValues);
		}	
		return grades;
	}

	public static double computeClassAverage(int item, int[][] scoreTable)
	{
		double total = 0; 
		double totalStudents = 0;
		for(int i = 0; i < scoreTable.length; i++)
		{
			if(scoreTable[i][item]!= 0){
				total += scoreTable[i][item];
				totalStudents++;
			}

		}	
		double average = total/totalStudents;
		return average;
		
	}
	
}