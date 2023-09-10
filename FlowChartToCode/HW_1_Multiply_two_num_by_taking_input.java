package FlowChartToCode;

import java.util.Scanner;

public class HW_1_Multiply_two_num_by_taking_input {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int mul=a*b;
		System.out.println(mul);
	}
}
