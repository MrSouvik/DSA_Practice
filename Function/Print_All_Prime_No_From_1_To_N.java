package Function;

public class Print_All_Prime_No_From_1_To_N {
	
	public static void printPrime(int num) {
		for(int i=2;i<num;i++) {
			boolean isprime=true;
			for(int j=2;j<i-1;j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
			}
			if(isprime) {
				System.out.print(i+" ");
			}
			
		}
	}
	public static void main(String[] args) {
		int n=100;
		printPrime(n);
	}
}
