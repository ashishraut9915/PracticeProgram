package codingQuestion;

import java.util.Arrays;

public class MergeArra {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		
		int b[]= {5,6,7};
		
		int a1 = a.length;
		int b2 = b.length;
		
		int c1 = a1 + b2 ;
		
		int c[] =new int[c1] ;
		
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b2);  
		
		System.out.println(Arrays.toString(c));
		
		
				
				
	}

}
