package Pattern;
/*
 * 
 * 		1
 * 		2*3
 * 		4*5*6
 * 		7*8*9*10
 * 		7*8*9*10
 * 		4*5*6
 * 		2*3
 * 		1
 * 
 */
public class Number_Pattern_3 {
	public static void main(String[] args) {
		int n=4;int num=1;
		for(int row=0;row<n;row++) {
			for(int col=0;col<row+1;col++) {
				System.out.print(num++);
				if(col<row) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		int start=num-n; //11-7
		for(int row=0;row<n;row++) {
			int k=start; //7
			for(int col=0;col<=n-row-1;col++) {
				System.out.print(k);
				k++;
				if(col<n-row-1) {
					System.out.print("*");
				}
			}
			start=start - (n-row-1);
			System.out.println();
		}
		
		
		
//		for(int row=0;row<n;row++) {
//			int num2=num-(n-row); //11-4-0=7 //7-4-1=2
//			int end=num2+n-row-1; //7+4-0-1=10 //2+4-1-1=4
//			for(int col=num2;col<end+1;col++)
//			{
//				System.out.print(col);
//				if(col!=end) {
//					System.out.print("*");
//				}
//			}
//			num-=(n-row); //11-4-0=7
//			System.out.println();
//		}
	}
}


