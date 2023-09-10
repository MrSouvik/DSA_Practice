package Pattern;
/*
 *     1
 *     2  3
 *     4  5  6
 *     7  8  9  10
 *     11 12 13 14 15
 *     16 17 18 19 20 21
 * 
 */
public class HW_Floyid_Triangle {
	public static void main(String[] args) {
		int n=6;
		int number=1;
		for(int row=0;row<n;row++) {
			for(int col=0;col<row+1;col++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
}
