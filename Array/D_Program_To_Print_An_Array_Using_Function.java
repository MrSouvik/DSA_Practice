package Array;

public class D_Program_To_Print_An_Array_Using_Function {
	
    private static void printArray(int[] arr, int n) {
    	for(int i=0;i<n;i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println("\nArray printed sucessfully using function");
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		printArray(arr,n);
		System.out.println("Main Method Completed");
	}

	
}
