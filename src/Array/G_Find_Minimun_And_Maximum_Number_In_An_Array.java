package Array;

public class G_Find_Minimun_And_Maximum_Number_In_An_Array {
	
	private static int findMinimun(int[] arr, int n) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	private static int findMaximum(int[] arr, int n) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,1,2,8,9,3,10};
		int n=arr.length;
		int min=findMinimun(arr,n);
		int max=findMaximum(arr,n);
		System.out.println("MIN = "+min);
		System.out.println("MAX = "+max);
	}

	

	
}
