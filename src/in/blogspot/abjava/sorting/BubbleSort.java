/**
 * This program explains one of the simplest and very inefficient 
 * sorting technique - bubble sort.
 * sorts an array in ascending order. 
 */
package in.blogspot.abjava.sorting;


/**
 * @author dinesh
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {4, 1, 8, 2, 3, 9, 7, 6, 10, 5};
		//int arr[] = {10,9,8,7,6,5,4,3,2,1};
		
		BubbleSort bubbleSort = new BubbleSort();
		System.out.print("Unsorted Array : ");
		bubbleSort.printArray(arr);
		System.out.println();
		bubbleSort.sort(arr);
	}
	private void sort(int[] arr) {
		int outer,inner;
		int totalNoOfComparisons = 0 ;
		for(outer = 1; outer<arr.length ; outer++){
			int noOfComp = 0;
			for(inner = 0 ; inner < outer ; inner++){
				noOfComp++;
				totalNoOfComparisons++;
				if (arr[inner] > arr[inner+1]) {
					swap(arr,inner,inner+1);
				}
			}
			System.out.print("####### Pass "+(arr.length-outer)+" : ");
			printArray(arr);
			System.out.print(" Comparisons : "+noOfComp+"\n");
		}
		System.out.println("Total number of Comparisons :" +totalNoOfComparisons);	//Mathematically It will be N*(N-1)/2
	}
	private void swap(int arr[],int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
