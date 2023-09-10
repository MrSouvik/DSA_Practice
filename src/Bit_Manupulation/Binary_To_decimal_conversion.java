package Bit_Manupulation;

import java.util.Scanner;

public class Binary_To_decimal_conversion {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter a Binary Number: ");
		 int num=sc.nextInt();
		 
		 int ans=0;
		 int i=0;
		 
		 while(num!=0) {
			 int rem=num % 10;
			 if(rem==1)
				 ans=((int) (Math.pow(2, i)))+ans;
			 num=num/10;
			 i++;
		 }
		 System.out.println("Answer is : "+ans);
	}
}
