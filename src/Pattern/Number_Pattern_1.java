package Pattern;
/*
 * 			3
 *          4 4
 *          5 5 5
 *          6 6 6 6
 *          5 5 5
 *          4 4
 *          3
 * 
 */
public class Number_Pattern_1 {
	public static void main(String[] args) {
		int n=4;
		for(int row=0;row<n;row++) {
			for(int col=0;col<row+1;col++) {
				System.out.print(row+3+" ");
			}
			System.out.println();
		}
		for(int row=0;row<n-1;row++) {
			for(int col=0;col<n-1-row;col++) {
				System.out.print(n-1-row+2+" ");
			}
			System.out.println();
		}
	}
}
