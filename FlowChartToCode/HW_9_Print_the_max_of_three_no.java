package FlowChartToCode;

public class HW_9_Print_the_max_of_three_no {
	public static void main(String[] args) {
		int a=8;
		int b=2;
		int c=4;
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {//b>a
			if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
			
		}
	}
}
