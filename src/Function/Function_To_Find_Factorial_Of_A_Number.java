package Function;

public class Function_To_Find_Factorial_Of_A_Number {
	
	public static int findFactorial(int num) {
		int fact=1;
		for(int i=num;i>0;i--) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int n=5;
		int factorial=findFactorial(n);
		System.out.println(factorial);
	}
}
