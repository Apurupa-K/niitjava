package assignment;

public class MaxMinInArray {
	public static void main(String[] args) {
		 int arr[] = new int[]{21,34,65,786,345,43,98};
		 
		 int smallest = arr[0];
		 int largest = arr[0];
		 
		 for(int i=1; i< arr.length; i++)
		 {
		 if(arr[i] > largest)
		 largest = arr[i];
		 else if (arr[i] < smallest)
		 smallest = arr[i];
		 
		 }
		 System.out.println("Smallest Number is : " + smallest);
		 System.out.println("Largest Number is : " + largest); 
		 }

}
