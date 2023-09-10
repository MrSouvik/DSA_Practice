package FlowChartToCode;

import java.util.Scanner;

public class Multiply_n_number_from_user {
	public static void main(String[] args) {
		int n=5;
		int ans=1;
		for(int i=0;i<5;i++) {
			Scanner sc=new Scanner(System.in);
			int temp=sc.nextInt();
			ans=ans*temp;
		}
		System.out.println(ans);
	}
}
