package FlowChartToCode;

public class HW_8_Check_valid_triangle_or_not {
	public static void main(String[] args) {
		int a=2;
		int b=3;
		int c=4;
		//2 3 4 valid
		if(a+b>c && b+c>a && a+c>b) {
			System.out.println("Valid Triange");
		}
		else {
			System.out.println("Not Valid");
		}
	}
}
