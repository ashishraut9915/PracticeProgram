package codingQuestion;

import java.util.Scanner;

public class JavaExample {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter no : ");
    	
    	int num = sc.nextInt();
    	
        //int num = 370;
        int number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}