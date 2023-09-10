package Array;

public class O_Print_Pair_Sum_And_tripple_Sum {
	
	private static void printPairSum(int[] arr, int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=0;
			for(int j=0;j<n;j++) {
				sum=arr[i]+arr[j];
				System.out.println(arr[i]+"+"+arr[j]+"="+sum);
			}
		}
	}
	
	private static void printTrippleSum(int[] arr, int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum=0;
				for(int k=0;k<n;k++) {
					sum=arr[i]+arr[j]+arr[k];
					System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+sum);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int n=arr.length;
		System.out.println("Printing pair sum -> ");
		printPairSum(arr,n);
		System.out.println("Printing tripple sum -> ");
		printTrippleSum(arr,n);
	}

	
}
