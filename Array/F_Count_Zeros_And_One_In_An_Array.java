package Array;

public class F_Count_Zeros_And_One_In_An_Array {
	
	private static void countZerosOne(int[] arr, int n) {
		int one=0;
		int zero=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				zero++;
			}
			if(arr[i]==1) {
				one++;
			}
		}
		System.out.println("One Count : "+one);
		System.out.println("Zero Count : "+zero);
	}
	public static void main(String[] args) {
		int arr[]= {0,0,0,0,0,1,0,1,1,1,1,0,1,0,1,1,0};
		int n=arr.length;
		countZerosOne(arr,n);
	}

	
}
