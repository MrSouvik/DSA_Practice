package Array;

import java.util.Scanner;

public class A_Program_To_Take_Input_In_An_Array_And_Printing_It {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter the element at index "+i+": ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Printing array --> ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
