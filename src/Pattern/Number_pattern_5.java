package Pattern;
/*
 *		1
 *      2 3
 *      4 5 6
 *      7 8 9 10
 *      11 12 13 14 15
 *      16 17 18 19 20 21
 *      22 23 24 25 26 27 28 			
 * 
 * 
 */
public class Number_pattern_5 {
	public static void main(String[] args) {
		int num=1;
		int n=7;
		for(int row=0;row<n;row++) {
			for(int col=0;col<row+1;col++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
