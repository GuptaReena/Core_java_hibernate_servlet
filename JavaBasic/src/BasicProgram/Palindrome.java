package BasicProgram;

	

public class Palindrome {
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "game";
		
		int i = 0 ,  j =  s1.length() -1;
		
		while(i < j) {
			if(s1.charAt(i) != s1.charAt(j)) {
				System.out.println(s1 + " : String is not a Plaindrome");
				System.exit(0);
			}
			
			i++;
			j--;
		}
		System.out.println(s1 + " : String is a palindrome");
	}

}
