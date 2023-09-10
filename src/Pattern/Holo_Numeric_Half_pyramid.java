package Pattern;
/*
 * 			1
 * 			12
 * 			1 3
 * 			1  4
 * 			12345
 * 
 * 
 */
public class Holo_Numeric_Half_pyramid {
	public static void main(String[] args) {
		int n=5;
		for(int row = 0; row<n;row++) {
			for(int col = 0; col<row+1; col++) {
				if(row==0 || row==n-1 || col==0 || col==row) {
					System.out.print(col+1+" ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
}
