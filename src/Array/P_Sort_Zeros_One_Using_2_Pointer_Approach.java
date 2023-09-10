package Array;

public class P_Sort_Zeros_One_Using_2_Pointer_Approach {
	public static void main(String[] args) {
		int arr[]= {0,0,0,0,1,1,1,0,1};
		int n=arr.length;
		System.out.print("Printing array before sort - > ");
		printArray(arr,n);
		sortUsing2Pointer(arr,n);
		System.out.print("\nPrinting array after sort  - > ");
		printArray(arr,n);
	}
	
	private static void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	private static void sortUsing2Pointer(int[] arr, int n) {
		int left=0;
		int right=n-1;
		while(left<right) {
			if(arr[left]==0) {
				left++;
			}
			else if(arr[right]==1) {
				right--;
			}
			else{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
	}
}
