package codingQuestion;

import java.util.Scanner;

public class Palimdrome {
	  
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number/String: ");
		
		String str = sc.next();
		String org_str = str ;
	
		String rev = "";
		int len = str.length();
		
		for(int i =len-1; i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		
		
		if(org_str.equals(rev)) {
			System.out.print(org_str+" Palindrome");
		}else {
			System.out.print(org_str+" Not Palindrome");
		}
		
		
		
	}
	

}
