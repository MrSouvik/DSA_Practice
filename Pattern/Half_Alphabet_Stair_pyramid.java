package Pattern;
/*
 * 	      A
 * 		  A B A
 *        A B C B A
 *        A B C D C B A
 *        A B C D E D C B A
 * 
 * 
 */
public class Half_Alphabet_Stair_pyramid {
	public static void main(String[] args) {
		int n=5;
		char ch;
		for(int row=0;row<n;row++) {
			ch=(char) (row+'A'-row);
			for(int col=0;col<row+1;col++) {
				System.out.print(ch+" ");
				ch++;
			}
			ch=(char) (ch-2);
			for(int col=0;col<row;col++) {
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}
