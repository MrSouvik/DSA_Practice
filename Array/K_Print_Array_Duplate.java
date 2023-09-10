package Array;

public class K_Print_Array_Duplate {
	private static void printDuplate(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {10,20,30};
		int n=arr.length;
		printDuplate(arr,n);
	}

	
	
}
