package FlowChartToCode;

public class HW_7_Check_if_number_is_prime_or_not {
	public static void main(String[] args) {
		int n=8;
		boolean prime=true;
		for(int i=2;i<n;i++) {
			if(n%2==0) {
				prime=false;
			}
		}
		if(prime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
	}
}
