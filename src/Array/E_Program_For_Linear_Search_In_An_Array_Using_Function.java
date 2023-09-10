package Array;

public class E_Program_For_Linear_Search_In_An_Array_Using_Function {
	
	private static boolean linerSearch(int[] arr, int n, int target) {
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				found=true;
				break;
			}
		}
		System.out.println("Linear Search fonction completed");
		return found;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		int target=18;
		boolean found=linerSearch(arr,n,target);
		if(found)
			System.out.println("Target found");
		else
			System.out.println("Target not found");
		System.out.println("Main Method Completed");
	}

	
}
