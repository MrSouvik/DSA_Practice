package Pattern;
/*
 * 			*
 * 		   * *
 *        *   *
 *       *     *
 *      *       *
 * 
 * 
 */
public class Holo_Pyramid {
	public static void main(String[] args) {
		int n=5;
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
	}
}
