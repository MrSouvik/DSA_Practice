package Bit_Manupulation;

import java.util.Scanner;

public class Reverse_an_integer {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num=sc.nextInt();
		int ans=0;
		while(num!=0) {
			int rem=num%10;
			ans=10*ans+rem;
			num=num/10;
		}
		System.out.println("Reverse number is : "+ans);
	}

}
