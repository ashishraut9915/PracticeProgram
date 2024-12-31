package codingQuestion;

public class PrimeNumber {
	int m = 0  ;
	
    int flag = 0 ;
    void checkPrime(int num) {
    	m = num/2;
		if(num == 0 || num == 1) {
			System.out.println("It is not prime...!!");
		}else {
			for(int i = 2 ; i <= m ; i++) {
				if(num % i == 0 ) {
					System.out.println("Not Prime ");
					flag = 1 ;
					break ;
				}
			}
			if(flag==0) {
				System.out.println("Prime");
			}
		}
	}
	

	
	
	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.checkPrime(11);
		
	}

}
