package Pattern;
/*
 * 
 *		1
 *      1 1
 *      1 2 1
 *      1 3 3 1
 *      1 4 6 4 1
 *      1 5 10 10 5 1
 *      1 6 15 20 15 6 1 		
 * 
 */
public class Pascal_Triangle {
	public static void main(String[] args) {
		int n=7;
		for(int row=0;row<n;row++) {
			int num=1;
			for(int col=0;col<=row;col++) {
				System.out.print(num+" ");
				num=num*(row-col)/(col+1);
			}
			System.out.println();
		}
	}
}
