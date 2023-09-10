package Pattern;
/*
 * 
 * 	      1 2 3 4 5
 *		  2     5
 *		  3   5
 * 		  4 5
 *        5
 */
public class Hw_Numeric_Holo_Half_Pyramid {
	public static void main(String[] args) {
		int n=5;
		for(int row=0;row<n;row++) {
			for(int col=0;col<n-row;col++) {
				if(row==0) {
					System.out.print(col+1+" ");
				}
				else if(col==0 ) {
					System.out.print(row+1+" ");
				}
				else if(col==n-row-1) {
					System.out.print(n+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
