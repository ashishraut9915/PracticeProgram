package codingQuestion;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234 ;
		int rev = 0 ;
		//int len = num.length;
		
		while(num>0) {
			int lastDigit = num%10;
			rev =  (rev * 10) + lastDigit ;
			num /= 10 ;
		}
		System.out.println(rev);
	}
}
