package Array;

public class I_Extreme_Print_In_An_Array {
	private static void printExtreme(int[] arr, int n) {
		int left=0;
		int right=n-1;
		while(left<=right) {
			if(left==right) {
				System.out.print(arr[left]+" ");
			}
			else {
				System.out.print(arr[left]+" ");
				System.out.print(arr[right]+" ");
			}
			left++;
			right--;
		}
	}
	private static void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		System.out.print("Printing original array - >");
		printArray(arr,n);
		System.out.print("\nPrinting extreme        - >");
		printExtreme(arr,n);
	}

	
	
	
}
