package BasicProgram;

public class RevNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 111;
		
		int rev = 0 ; int rem;
		
		int orgnum = n;
		
		while(n != 0 ) {
			
			rem = n % 10;
			rev = rem +rev*10;
			n = n/10;
		}
		
		System.out.println(rev);
		
		if(orgnum == rev) {
			System.out.println("Number is a Palindrome");
		}
		else {
			System.out.println("Number is not a Palindrome");
		}
	}

}
