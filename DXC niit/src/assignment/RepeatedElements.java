package assignment;

public class RepeatedElements {
	void printRepeating(int arr[], int size)
	{
		int i, j;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < size; i++)
		{
			for (j = i + 1; j < size; j++)
			{
				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args)
	{
		RepeatedElements repeat = new RepeatedElements();
		int arr[] = {8,16,29,8,10,16};
		int arr_size = arr.length;
		repeat.printRepeating(arr, arr_size);
	}

}
