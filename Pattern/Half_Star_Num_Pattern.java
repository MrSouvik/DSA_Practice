package Pattern;
/*			
 * 			1
 * 			2*2
 * 			3*3*3
 * 			4*4*4*4
 * 			3*3*3
 * 			2*2
 * 			1
 * 
 * 			
 */
public class Half_Star_Num_Pattern {
	public static void main(String[] args) {
		int n=4;
		for(int row=0;row<n;row++) {
			for(int col=0;col<(2*row)+1;col++) {
				if(col%2!=0) {
					System.out.print("*");
				}
				else {
					System.out.print(row+1);
				}
			}
			System.out.println();
		}
		
		for(int row=0;row<n-1;row++) {
			for(int col=0;col<(2*(n-1))-(2*row)-1;col++) {
				if(col%2!=0) {
					System.out.print("*");
				}
				else {
					System.out.print(n-row-1);
				}
			}
			System.out.println();
		}
	}
}
