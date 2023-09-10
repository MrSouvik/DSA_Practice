package FlowChartToCode;

public class HW_6_Find_Factorial_of_a_Number {
	public static void main(String[] args) {
		int n=5;
		int fact=1;
		for(int i=n;i>0;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
