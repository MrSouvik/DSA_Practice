package Pattern;
/*
 *			1
 *			1 2
 *			1 2 3
 *			1 2 3 4
 *			1 2 3 4 5 			
 */
public class Numeric_half_Pyramid {
	public static void main(String[] args) {
		int n=5;
		for(int row = 0; row<n;row++) {
			for(int col = 0; col<row+1; col++) {
				System.out.print(col+1+" ");
			}
			System.out.println();
		}
	}
}
