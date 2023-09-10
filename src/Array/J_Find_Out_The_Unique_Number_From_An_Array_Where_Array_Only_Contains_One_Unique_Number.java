package Array;

public class J_Find_Out_The_Unique_Number_From_An_Array_Where_Array_Only_Contains_One_Unique_Number {
	 
	private static int findUniqueElement(int[] arr, int n) {
		int uniqueEle=0;
		for(int i=0;i<n;i++) {
			uniqueEle^=arr[i];
		}
		return uniqueEle;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,4,5,6,5,6,4};
		int n=arr.length;
		int uniqueEle=findUniqueElement(arr,n);
		System.out.println("Unique Ellement - > "+uniqueEle);
	}

	
}
