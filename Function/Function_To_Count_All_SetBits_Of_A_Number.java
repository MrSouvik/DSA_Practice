package Function;

public class Function_To_Count_All_SetBits_Of_A_Number {
	
	public static int countSetBit(int n) {
		int count=0;
		while(n!=0) {
			int bit=n&1;
			if(bit==1) {
				count++;
			}
			n=n>>1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int n=15;
		int setBitCount=countSetBit(n);
		System.out.println(setBitCount);
	}
}
