package Pattern;
/*
 * 
 * 		        1
 * 			  1 2 1
 *          1 2 3 2 1
 *        1 2 3 4 3 2 1
 *      1 2 3 4 5 4 3 2 1
 * 
 */
public class HW_Numeric_Palindrom_Equilable_Pyramid {
	public static void main(String[] args) {
		int n=5;
		for(int row=0;row<n;row++) {
			for(int col=0;col<n-row-1;col++) {
				System.out.print("  ");
			}
			for(int col=0;col<row+1;col++) {
				System.out.print(col+1+" ");
			}
			for(int col=0;col<row;col++) {
				System.out.print(row-col+" ");
			}
			System.out.println();
		}
	}
}
