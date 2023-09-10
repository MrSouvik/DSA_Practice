package Pattern;
/*
 * 		*             *
 * 		* *         * *
 *		* * *     * * *
 *		* * * * * * * *
 *		* * * * * * * *
 *		* * *     * * *
 *		* *         * *
 *		*             *
 * 
 * 
 */
public class HW_Butterfly_Pattern {
	public static void main(String[] args) {
		int n=4;
		for(int row=0;row<n;row++) {
			for(int col=0;col<row+1;col++) {
				System.out.print("* ");
			}
			for(int col=0;col<(2*n)-(2*row)-2;col++) {
				System.out.print("  ");
			}
			for(int col=0;col<row+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row=0;row<n;row++) {
			for(int col=0;col<n-row;col++) {
				System.out.print("* ");
			}
			for(int col=0;col<(2*n)+(2*row)-(2*n);col++) {
				System.out.print("  ");
			}
			for(int col=0;col<n-row ;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
