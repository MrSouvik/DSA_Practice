package Function;
/**
 * 
 * @author Souvik
 *
 */
public class Print_Binary_Represantaion_Of_A_Decimal_No {
	public static int getBinary(int decimal) {
		int i=0;
		int binary=0;
		while(decimal!=0) {
			int bit=decimal & 1;
			binary=binary + (int)(bit*Math.pow(10, i));
			decimal=decimal>>1;
			i++;
		}
		return binary;
	}
	
	public static void main(String[] args) {
		int n=50;
		int binary=getBinary(n);
		System.out.println(binary);
	}
}
