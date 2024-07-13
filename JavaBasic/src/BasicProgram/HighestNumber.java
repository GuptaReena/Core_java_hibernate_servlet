package BasicProgram;

public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1,2,5,10,13,20,7,9,6};
		
//		System.out.println(arr);
		
	
		int max =0 ;
		
		for(int i =0; i < arr.length; i++) {
			
			if(arr[i] > max ) {
				
				max = arr[i];
			}
			
			
		}
		
		System.out.println(max);
	}

}
