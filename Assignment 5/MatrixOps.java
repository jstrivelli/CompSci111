public class MatrixOps
{

	public static double[][] multiply2(double[][] m1, double[][] m2)
	{
		// When multiplying 2 matrices, 
		// we must make sure that we can match the form
		// 		(A  x  B) * (B  *  C)  -->  (A  *  C)
		// Check to see if m1 columns == m2 rows
		// report error otherwise and return NULL

		int r1 = m1.length;			// Number of rows in Matrix 1
		int c1 = m1[0].length;		// Number of cols in Matrix 1
		int r2 = m2.length;			// Number of rows in Matrix 2
		int c2 = m2[0].length;		// Number of cols in Matrix 2

		// Check to make sure inner dimensions are the same
		if (c1 == r2)
		{
			// Instantiate returned array using rows and cols
			double [][] out = new double [r1][c2];

			// Then use multiplication algorithm
			for(int a = 0; a < r1; a++)						// For each entry in resulting matrix
				for(int b = 0; b < c2; b++)
				{
					out[a][b] = 0;							// Start at zerp
					for(int c = 0; c < c1; c++)
						out[a][b] += (m1[a][c] * m2[c][b]); // Add element multiplication entries
				}
			
			// Return result matrix
			return out;
		}
		else // Otherwise return null for bad dimensions
		{
			return IO.reportBadInput();
		}
	}
}
