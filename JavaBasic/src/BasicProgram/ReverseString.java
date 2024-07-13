package BasicProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reverse =  "reena";
		
		String r1 = "";
		
		int length = reverse.length();
		
		for(int i = 0 ; i<length ; i++) {
			
			r1 =   reverse.charAt(i) +r1 ;
			
			
		}
		
		System.out.println(r1);
		
				
	}

}
