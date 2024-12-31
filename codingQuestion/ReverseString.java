package codingQuestion;

import java.util.Scanner;

public class ReverseString {
	/**********using algorith*************/
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int num = sc.nextInt();
		
		int rev= 0;//most imp
		
		while(num!=0) {
			
			rev = rev*10 + num % 10 ;//0+1234%10 = 4     40+3= 43  430+2=432  4320+1=4321
			num = num / 10 ;  // 1234/10=123  123/10=12   12/10=1   1/10=0
 	 	
 		}
		System.out.println("Rev number is:"+ rev);
	}*/
	

	/********using stringBuffer class*********/
	
	
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
				
		int num = sc.nextInt();

		//int rev= 0;
		
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Rev number is:"+ rev);

	}*/
	
	
	/*****************stringBuilder*********************/
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
				
		int num = sc.nextInt();

		StringBuilder sb1 = new StringBuilder();
		sb1.append(num) ;
		StringBuilder rev = sb1.reverse();	
		System.out.println("Rev number is:"+ rev);
		

	}
	
	
	
	
}
