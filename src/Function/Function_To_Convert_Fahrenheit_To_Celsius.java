package Function;

public class Function_To_Convert_Fahrenheit_To_Celsius {
	
	public static double convertFahrenheitToCelsius(double Fahrenheit) {
		double celsius=0.0;
		celsius=(Fahrenheit-(double)32)*((double)5/(double)9);
		return celsius;
	}
	
	public static void main(String[] args) {
		double f=40;
		double celsius=convertFahrenheitToCelsius(f);
		System.out.println(celsius);
	}
}
