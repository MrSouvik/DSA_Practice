package Array;

public class N_Shift_Arrays_Element_By_One_Right_Position {
	private static void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	private static void shiftArraysElementRightByOne(int[] arr, int n) {
		int temp=arr[n-1];
		for(int i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,8,9,0};
		int n=arr.length;
		System.out.print("Printing array before shift - > ");
		printArray(arr,n);
		shiftArraysElementRightByOne(arr,n);
		System.out.print("\nPrinting array after shift  - > ");
		printArray(arr,n);
	}

	
}
