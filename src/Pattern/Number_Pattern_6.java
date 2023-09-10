package Pattern;
/*
 * 			1
 *          1 1
 *          1 2 1
 *          1 3 3 1
 *          1 4 6 4 1
 *          1 5 10 10 5 1
 *          1 6 15 20 15 6 1
 * 
 */
public class Number_Pattern_6 {

	public static void main(String[] args) {
		int n=7; int c=1;
		for(int row=0;row<n;row++) {
			for(int col=0;col<row+1;col++) {
				if(col==0 || col==row) {
					System.out.print("1 ");
				}
				else if(col==1) {
					System.out.print(row+" ");
				}
				else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}
}
