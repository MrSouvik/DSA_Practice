package Pattern;
/*
 * 			*       *
 * 	         *     *
 * 			  *   *
 * 			   * *
 *              *
 * 
 */
public class Inverted_Holo_pyramid {
		public static void main(String[] args) {
			int n=5;
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
