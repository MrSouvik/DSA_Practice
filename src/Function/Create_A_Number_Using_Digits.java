package Function;

import java.util.Scanner;

public class Create_A_Number_Using_Digits {	
	public static int createANumberUsingDigits(int numOfDigits) {
		Scanner sc=new Scanner(System.in);
		int ans=0;
		for(int i=0;i<numOfDigits;i++) {
			System.out.print("Enter Digit : ");
			int digits=sc.nextInt();
			ans=ans*10+digits;
		}
		return ans;
	}
	public static void main(String[] args) {
		int numOfDigits=5;
		int newNum=createANumberUsingDigits(numOfDigits);
		System.out.print("Number : "+newNum);
	}
}
