package FlowChartToCode;

public class Calculate_overal_percentage_from_marks {
	public static void main(String[] args) {
		int physic=55;
		int chemistry=51;
		int math=70;
		double overalPercentage=((physic+chemistry+math)*100)/300;
		System.out.println(overalPercentage+"%");
	}
}
