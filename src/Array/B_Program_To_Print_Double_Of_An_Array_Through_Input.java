package Array;

import java.util.Scanner;

public class B_Program_To_Print_Double_Of_An_Array_Through_Input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter the element at index "+i+": ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Printing array after doubles --> ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]*2+" ");
		}
	}
}
