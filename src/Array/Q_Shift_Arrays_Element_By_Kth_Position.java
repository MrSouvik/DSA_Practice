package Array;

public class Q_Shift_Arrays_Element_By_Kth_Position {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		int k = 3;
		System.out.print("Printing array before shift - > ");
		printArray(arr,n);
		shiftArrayElementByKthPosition(arr,n,k);
		System.out.print("\nPrinting array after shift  - > ");
		printArray(arr,n);
	}
	private static void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	private static void shiftArrayElementByKthPosition(int[] arr, int n, int k) {
		int temp[]=new int[k];
		int index=k-1;
		for(int i=n-1;i>n-k-1;i--) {
			temp[index]=arr[i];
			index--;
		}
		for(int i=n-1-k;i>=0;i--) {
			arr[i+k]=arr[i];
		}
		
		for(int i=0;i<k;i++) {
			arr[i]=temp[i];
		}
	}
}
