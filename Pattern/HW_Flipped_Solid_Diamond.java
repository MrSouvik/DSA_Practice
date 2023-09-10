package Pattern;
/*
 * 
 * 			**** ****
 * 			***   ***
 * 			**     **
 * 			*       *
 * 			*       *
 * 			**     **
 * 			***   ***
 * 			**** ****
 * 
 */
public class HW_Flipped_Solid_Diamond {
	public static void main(String[] args) {
		int n=10;
		for(int row=0;row<n;row++) {
			for(int col=0;col<n-row;col++) {
				System.out.print("* ");
			}
			for(int col=0;col<(2*row)+1;col++) {
				System.out.print("  ");
			}
			for(int col=0;col<n-row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int row=0;row<n;row++) {
			for(int col=0;col<row+1;col++) {
				System.out.print("* ");
			}
			for(int col=0;col<(2*n)-(2*row)-1;col++) {
				System.out.print("  ");
			}
			for(int col=0;col<row+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
