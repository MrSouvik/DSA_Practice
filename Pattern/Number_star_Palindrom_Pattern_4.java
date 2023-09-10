package Pattern;
/*
 * 	   *
 * 	   * 1 * 
 *     * 1 2 1 *
 *     * 1 2 3 2 1 *
 *     * 1 2 1 *
 *     * 1 *
 *     * 
 * 	
 */
public class Number_star_Palindrom_Pattern_4 {
	public static void main(String[] args) {
		int n=4;
		int row,col;
		for(row=0;row<n;row++) {
			System.out.print("* ");
			for(col=0;col<row;col++) {
				System.out.print(col+1+" ");
			}
			for(col=col-1;col>=1;col--) {
				System.out.print(col+" ");
			}
			if(row!=0) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(row=0;row<n-1;row++) {
			System.out.print("* ");
			for(col=0;col<n-2-row;col++) {
				System.out.print(col+1+" ");
			}
			for(col=col-1;col>=1;col--) {
				System.out.print(col+" ");
			}
			if(row!=n-2) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	
}
