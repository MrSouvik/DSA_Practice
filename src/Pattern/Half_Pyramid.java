package Pattern;
/*
 * 			*
 * 			* *
 * 			* * *
 * 			* * * *
 * 			* * * * *
 */
public class Half_Pyramid {
	public static void main(String[] args) {
		int n=5;
		for(int row=0;row<n;row++) {
			for(int col=0;col<row+1;col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
