package Function;

public class Function_To_Find_Area_Of_Circle {
	
	public static double areaOfCircle(double redius) {
		double ans=0.0;
		final double pi=3.14;
		ans=pi*redius*redius;
		return ans;
	}
	
	
	public static void main(String[] args) {
		
		int r=8;
		double area=areaOfCircle(r);
		System.out.println(area);
		
	}
}
