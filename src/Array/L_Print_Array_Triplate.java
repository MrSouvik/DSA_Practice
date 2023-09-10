package Array;

public class L_Print_Array_Triplate {

	private static void printTriplate(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k                                             ]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {10,20,30};
		int n=arr.length;
		printTriplate(arr,n);
	}
}
