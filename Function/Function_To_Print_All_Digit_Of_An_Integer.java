package Function;

public class Function_To_Print_All_Digit_Of_An_Integer {

	public static void printDigit(int number) {
		while(number!=0) {
			int digit=number%10;
			System.out.print(digit+" ");
			number=number/10;
			
		}
	}
	public static void main(String[] args) {
		int num=45764;
		printDigit(num);
	}
}
