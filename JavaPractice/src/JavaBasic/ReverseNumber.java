package JavaBasic;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n =  20;
		int rev = 0;
		int rem;
		
		while(n!=0) {
			
			rem = n%10;
			rev =  rem+ rev*10;
			n = n/10;
			
		}
		
		System.out.println(rev);

	}

}
