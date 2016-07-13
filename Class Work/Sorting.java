public class Sorting
{
	public static void selectionSort(int [] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int min = arr[i];
			int min_index = i;
			for(int j = i; j < arr.length; j++)
			{
				if(arr[j] < min)
				{
					min = arr[j];
					min_index = j;
				}
			}
			// SWAP IN HERE
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}		
	}

	public static void main (String [] args)
	{
		int [] arr = {3,1,8,2,4,12,26,22,5,7};
		selectionSort(arr);
		for(int a : arr)
			System.out.print(a + ", ");
		System.out.println();
	}

	public static void insertionSort(int [] arr)
	{
		if(arr.length < 2)
		{
			return;
		}	
		for(int i = 1; i < arr.length; i++)
		{
			int index = i;
			for(int j = i; j > 0; j--)
			{
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[i];
					arr[j] = temp;
				}	
				else{
					break;
				}
			}
		}
	}

}


// One by one through the array
// Along the way, were going to collect
// the smallest item in the list
// and swap it to the working index

// outcome is a sorted array ----> works in O(n^2) time.