package Pattern;
/*
 * 		*
 * 		* *
 * 		* * *
 * 		* * * *
 * 		* * *
 * 		* *
 * 		*
 * 
 */
public class HW_Solid_Half_Diamond {
	public static void main(String[] args) {
		int n=4;
		for(int row=0;row<n;row++) {
			for(int col=0;col<row+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row=0;row<n-1;row++) {
			for(int col=0;col<n-1-row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
