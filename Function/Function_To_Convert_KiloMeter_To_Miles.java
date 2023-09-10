package Function;

public class Function_To_Convert_KiloMeter_To_Miles {
	public static double convertKiloToMiles(float kilometer) {
		double miles=0;
		final double oneMiles=0.621371;
		miles=(double)kilometer*oneMiles;
		return miles;	
	}
	
	public static void main(String[] args) {
		float kiloMeter=67.89f;
		double miles=convertKiloToMiles(kiloMeter);
		System.out.println(miles);
	}
}
