package Pattern;
/*
 * 			1 2 3 4 5
 * 			1 2 3 4
 * 			1 2 3
 * 			1 2
 * 			1
 */
public class Inverted_numeric_half_Pyramid {
	public static void main(String[] args) {
		int n=5;
		for(int row=0; row<n; row++) {
			for(int col=0;col<n-row; col++) {
				System.out.print(col+1+" ");
			}
			System.out.println( );
		}
	}
}
