package Array;

public class C_Linear_Search_In_An_Array {
	public static void main(String[] args) {
		int arr[]= {5,4,8,7,6,2,1,3};
		int n=arr.length;
		int target=5;
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				found=true;
				break;
			}
		}
		if(found)
			System.out.println("Target found");
		else
			System.out.println("Target not found");
		
	}
}
