package Pattern;
/*
 * 		1
 * 		2*2
 * 		3*3*3
 * 		4*4*4*4
 * 		4*4*4*4
 * 		3*3*3
 * 		2*2
 * 		1
 * 
 * 	
 */
public class Number_Pattern_2 {
	public static void main(String[] args) {
		int n=4;
		for(int row=0;row<n;row++) {
			for(int col=0;col<(2*row)+1;col++) {
				if(col%2==0) {
					System.out.print(row+1);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int row=0;row<n;row++) {
			for(int col=0;col<(2*n)-(2*row)-1;col++) {
				if(col%2==0) {
					System.out.print(n-row);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
