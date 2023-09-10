package FlowChartToCode;

public class HW_4_Find_compount_interest {
	public static void main(String[] args) {
		double p=10000;
		double r=10;
		double t=5;
		double n=3;
		double CI= (p*(Math.pow((1 + r / 100), t)));
		System.out.println(CI);
	}
}
