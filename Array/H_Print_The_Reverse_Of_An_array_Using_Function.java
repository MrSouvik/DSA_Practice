package Array;

public class H_Print_The_Reverse_Of_An_array_Using_Function {
	private static void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void swapNo
	(int[] arr, int start, int end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	private static void reverseArray(int[] arr, int n) {
		int start=0;
		int end=n-1;
		while(start<end) {
			swapNo(arr,start,end);
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		System.out.print("Printing array before reverse - > ");
		printArray(arr,n);
		reverseArray(arr,n);
		System.out.print("\nPrinting array after reverse  - > ");
		printArray(arr,n);
	}

	
}
