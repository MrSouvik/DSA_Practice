package Array;

public class M_Sort_Zeros_And_One_Using_Loop {
	private static void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	private static void sortZeroAndOne(int[] arr, int n) {
		int zero=0;
		int one=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				zero++;
			}
			if(arr[i]==1) {
				one++;
			}
		}
		int index=0;
		while(zero>0) {
			arr[index]=0;
			index++;
			zero--;
		}
		while(one>0) {
			arr[index]=1;
			index++;
			one--;
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {0,0,1,1,0,1,0,1,1,0,0,1};
		int n=arr.length;
		System.out.print("Printing array before sort - > ");
		printArray(arr,n);
		sortZeroAndOne(arr,n);
		System.out.print("\nPrinting array after sort  - > ");
		printArray(arr,n);
	}

	
}
