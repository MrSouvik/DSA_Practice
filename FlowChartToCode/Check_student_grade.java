package FlowChartToCode;

public class Check_student_grade {
	public static void main(String[] args) {
		int marks=40;
		if(marks>=90) {
			System.out.println("A");
		}
		else if(marks>=70) {
			System.out.println("B");
		}
		else if(marks>=50) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
	}
}
