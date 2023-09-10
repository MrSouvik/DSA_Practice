package Pattern;
/*
 * 				*
 * 			   * *
 * 			  *   *
 *           *     *
 *          *       *
 *         *         *
 *         *         *
 *          *       *
 *           *     * 
 *            *   *
 *             * *
 *              *
 * 
 * 
 * 
 */
public class HW_Holo_Diamond {
	public static void main(String[] args) {
		int num=3;
		int n=num*2;
		
		for(int row=0;row<n;row++) {
			for(int col=0;col<n-row-1;col++) {
				System.out.print(" ");
			}
			for(int col=0;col<row+1;col++) {
				if(col==0 || col==row) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		for(int row=0;row<n;row++) {
			for(int col=0;col<row;col++) {
				System.out.print(" ");
			}
			for(int col=0; col<n-row;col++) {
				if(col==0 || col==n-row-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		
	}
	}
}
