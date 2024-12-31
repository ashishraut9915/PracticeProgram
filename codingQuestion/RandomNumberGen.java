package codingQuestion;

import java.util.Random;

public class RandomNumberGen {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int ran = rand.nextInt(10);
		System.out.println(ran);
		
		
		System.out.println("-----------");
		
		double rand_dou = rand.nextDouble();
		System.out.println(rand_dou);
		
	}

}
