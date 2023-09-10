package Pattern;
/*
 * 		1 2 3 4 5 
 * 		2     5
 *      3   5
 *      4 5
 *      5
 * 
 * 
 */
public class Inverted_Holo_Numeric_half_pyramid {
		public static void main(String[] args) {
			int n=5;
			for(int row=0;row<n;row++) {
				
				for(int col=row+1;col<=n;col++) {
					if(col==row+1 || col==n || row==0) {
						System.out.print(col+" ");
					}
					else {
						System.out.print("  ");
					}
					
				}
				System.out.println();
			}
		}
}
