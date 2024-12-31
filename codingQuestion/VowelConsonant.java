package codingQuestion;

import java.util.Scanner;

public class VowelConsonant {

	
	
	public void consonantVowel(char ch) {
		
		if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
			System.out.println(ch + " is vowel...!");
		}else {
			System.out.println(ch + " is consonant...!");
		}
	}
	
	
	public static void main(String[] args) {
	
		VowelConsonant cv = new VowelConsonant();
		
		cv.consonantVowel('z');
		
		
	}
}
