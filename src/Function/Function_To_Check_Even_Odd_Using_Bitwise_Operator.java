package Function;
/*
 *   0 -> 000 0 - even
 *   1 -> 000 1 - odd
 *   2 -> 001 0 - even
 *   3 -> 001 1 - odd
 *   4 -> 010 0 - even
 *   5 -> 010 1 - odd
 *   6 -> 011 0 - even
 *   7 -> 011 1 - odd
 *   
 *   if last bit of a number is 0 the it's an even number, if last bit of a number is 1 then 
 *   it's a odd number
 *   
 * 
 * 
 */
public class Function_To_Check_Even_Odd_Using_Bitwise_Operator {
	public static void evenOddCheckingUsingBitwiseOperator(int num) {
		if((num & 1) == 0) {
			System.out.print(num+" is Even Number");
		}
		else {
			System.out.print(num+" is odd Number");
		}
	}
	public static void main(String[] args) {
		int n=18;
		evenOddCheckingUsingBitwiseOperator(n);
	}
}
