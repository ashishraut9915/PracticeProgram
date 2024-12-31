package codingQuestion;

public class Factorial {

	
	public void fact(int num) {
		
		int temp = 1 ;
		for(int i = 1 ; i  <= num ; i++) {
			temp *= i ;
			
		}
		
		System.out.println("Factorial is : "+temp);
	}
	
	
	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.fact(4);
	}
}
