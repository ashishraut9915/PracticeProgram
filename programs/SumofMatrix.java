package com.string.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
/**
public class HashmapIteration {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(2, "Naresh");
        map.put(25, "Ashish");
        map.put(12, "Prasad");
        System.out.println(map.size());
        System.out.println("\nWhile Loop:");
        
        Iterator itr = map.entrySet().iterator();  
        while(itr.hasNext()) {
        	Map.Entry me= (Map.Entry)itr.next();
        	System.out.println("Key is "+me.getKey() + " value is " + me.getValue());	
        }
        System.out.println("\nUsing for Loop: ");
        
        for (Map.Entry me2 : map.entrySet()) {
        	System.out.println("Key is " + me2.getKey() + " value is " + me2.getValue());
			
		}
        
	}

}


// 

public class CountWordUsingHashmap {
	
	 public static void main(String[] args) {
	        String str = "This this is is done by Saket Saket";
	        String[] split = str.split(" ");
	         
	        HashMap<String,Integer> map = new HashMap<String,Integer>();
	        for (int i=0; i<split.length; i++) {
	            if (map.containsKey(split[i])) {
	                int count = map.get(split[i]);
	                map.put(split[i], count+1);
	            }
	            else {
	                map.put(split[i], 1);
	            }
	        }
	        System.out.println(map);
	    }
}


// prime

class Check_prime{
	public static void main(String[] args) {
		int temp , num, count = 0;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Number ");
		num = sc.nextInt();
		
		
		if(num <= 1) {
			System.out.println("not prime");
		}
		
		for (int i = 2; i == num/2; i++) {
			if(num % i == 0) {
				count++ ;
			}
		}
		
		if(count > 1) {
			System.out.println("not prime");
		}else {
			System.out.println("prime");
		}
		
	} 
}


//fibonacci 

class Fibo{
	public static void main(String[] args) {
		
		int a = 0 , b = 1 , c = 0 ;
		System.out.print(a + " " + b +" ");
		
		for(int i = 2 ; i < 10 ; i++) {
			c = a + b ;
			System.out.print(c);
			a = b ;
			b = c ;
		}
	}
}



public class String_Palindrome {
	
	public static void main(String[] args) {
		
		String original, reverse = "" ;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string : ");
		original = sc.nextLine();
		int length  = original.length();
		
		for(int i  = length - 1; i >= 0  ; i--) { 
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reverse is : "+ reverse );
		
		if(original.equals(reverse)) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not palindrome");
		}
		
	}
}



//swap

class Swap{
	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 20 ;
		
		System.out.println("before swapping of a: "+ a + " b: "+ b);
		
		a  =  a + b ;
		b  = a - b ;
		a = a - b ;
		System.out.println("after swpping a: "+ a + "b: "+ b);
		
	}
}





class Swap_U_3rdVari{
	public static void main(String[] args) {
		int x = 50 , y = 100, temp = 0 ;
		System.out.println("Before swapping a: "+ x + " y : "+ y);
		
		temp = x ;
		x = y ; 
		y = temp ;
		
		System.out.println("After swapping a: "+ x + " y : "+ y);	
	}
}




public class Reverse {
	 
    public static void main(String[] args) {
		
		 String original, reverse = "";
		 System.out.println("Enter the string to be reversed"); Scanner in = new
		 Scanner(System.in); original = in.nextLine(); int length = original.length();
		 for(int i=length-1; i==0; i--) { reverse = reverse + original.charAt(i); }
		 System.out.println(reverse);
		 
    }
}



class Arraylist_Iterator{
	public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("20");
        list.add("30");
        list.add("40");
        System.out.println(list.size());
        System.out.println("While Loop:");
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Advanced For Loop:");
        for(Object obj : list) {
            System.out.println(obj);
    }
        System.out.println("For Loop:");
        for(int i=0; i&lt;list.size(); i++) {
            System.out.println(list.get(i));
        }
}
}


class FindDuplicate {
	public static void main(String[] args) {
		String str = new String("aabbc");
		int count = 0 ;
		char []chars = str.toCharArray();
		System.out.println("Dulplicate char are: ");
		
		for(int i = 0 ; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				
				if(chars[i] == chars[j]) {
					System.out.println(chars[j]);
					count++;
					break;
				}
			}
			
		}
		
	}
}



class SecondHighestNumberInArray  {
	public static void main(String[] args) {
		
		int arr[] = {100,10,20,40,30,50,90,80,70,60};
		int largest = 0;
		int secondlargest = 0;
		System.out.println("The given array is: ");
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];	
			}else if (arr[i] > secondlargest) {
				secondlargest = arr[i];
			}
		}
		
		System.out.println("\nSecond largest number is: "+ secondlargest);
		System.out.println("Largest Number is: "+ largest);
	
		 for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	     System.out.print("Sorted Array: ");
	     for (int num : arr) {
	        System.out.print(num + " ");
	     }
	
	}
}



import java.util.Scanner;

public class SimpleArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit; 
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }

        
    }
}


class RemoveWhiteSpaces
{
    public static void main(String[] args)
    {
        String str1 = "I am           a  Java               Developer";
    
        String str2 = str1.replaceAll("\\s", "");
  
        System.out.println(str2);
	}
}



public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Class is        a blueprint         of an         object that contains         methods variables constructor";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar != ' ') {
                result += currentChar;
            }
        }

        System.out.println(result);
    }
}


public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 9; // Number of rows

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}



public class EqualityOfTwoArrays
{
    public static void main(String[] args)
    {   
        int[] arrayOne = {2, 9, 5, 7, 4};
         
        int[] arrayTwo = {2, 9, 5, 7, 4};
         
        boolean equalOrNot = true;
         
        if(arrayOne.length == arrayTwo.length)
        {
            for (int i = 0; i < arrayOne.length; i++)
            {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot = false;
        }
         
        if (equalOrNot)
        {
            System.out.println("Both Arrays Are Equal");
        }
        else
        {
            System.out.println("Both Arrays Are Not equal");
        }
    }
}


class EqualityOfTwoArrays{
	public static void main(String[] args) {
		int[] arrayOne = {2, 9, 5, 7, 4};
        
        int[] arrayTwo = {9, 2, 7, 7, 4};
        
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        
        System.out.println(Arrays.equals(arrayOne, arrayTwo));
	}
}


public class EqualityOfTwoArrays {
	
	 public static void main(String[] args) {
	        String str = "This this is is done by Saket Saket";
	        String[] split = str.split(" ");
	         
	        HashMap<String,Integer> map = new HashMap<String,Integer>();
	        for (int i=0; i<split.length; i++) {
	            if (map.containsKey(split[i])) {
	                int count = map.get(split[i]);
	                map.put(split[i], count+1);
	            }
	            else {
	                map.put(split[i], 1);
	            }
	        }
	        System.out.println(map);
	    }
}




public class Anagram{
	public static void main(String[] args) {
		
	}
}


public class SumDigit {
	
	public static void main(String[] args) {
		int num =10 ;
		int sum = 1 ;
		
		while(num != 0) {
			sum = sum + num %10 ;
			num = num/10;
			
		}
		
		System.out.println(sum);
		
		
	}
}


class Second_largestArray{
	
	public  int  secondLargest(int arr[], int total) {
		int  temp  = 0;
		int i, j;
		
		for( i = 0; i < arr.length; i++) {
			for( j = i+1; j < arr.length ; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i] ;
					arr[i] = arr[j];
					arr[j] = temp ;
				}
			}
			
		}
		return arr[total - 1];
	}

	public static void main(String[] args) {
			
			int [] arr = {20,10,30,50,120,60,90,80,70,100};
			Second_largestArray s = new Second_largestArray();
			System.out.println(s.secondLargest(arr, 10));
			
		}
}


class ArmstrongNum {
	public static void main(String[] args) {
		
		int num = 153 ;
		int rem ;
		int sum = 0, temp = num;
		while(num > 0) {
			rem = num % 10 ; 
			num /= 10 ;
			sum = sum+(rem * rem * rem ) ;
			
			System.out.println(sum);
			
		}
		
		if(temp == sum) {
			System.out.println("arms");
		}else {
			System.out.println("no arm");
		}
		
	}
}



//Creation Of Matrix In Java
class CreateMatrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		
		System.out.print("Enter col: ");
		int col = sc.nextInt();
		int[][] matrix = new int[row][col];
		for(int i = 0 ; i < row ; i++) {
			for(int j=0 ; j < col ; j++) {
				
				matrix [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Display Matrix");
		for(int i = 0; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				System.out.print(matrix[i][j]+"\t" );
			}
			System.out.println();
		}
		
	}
}


class SumofMatrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		
		System.out.print("Enter col: ");
		int col = sc.nextInt();
		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row][col];
		int[][] sum = new int[row][col];

		System.out.println("Enter matrix1 value:");
		for(int i = 0 ; i < row ; i++) {
			for(int j=0 ; j < col ; j++) {
				
				matrix1 [i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter matrix2 value:");
		
		for(int i = 0 ; i < row ; i++) {
			for(int j=0 ; j < col ; j++) {
				
				matrix2 [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix1 is: ");
		for(int i = 0 ; i < row ; i++) {
			for(int j=0 ; j < col ; j++) {
				
				System.out.print(matrix1[i][j]+ "\t");	
				
			}
			System.out.println();
			
		}
		System.out.println("Matrix2 is: ");
		for(int i = 0; i < row; i++) {
			for(int j =  0; j < col ; j++) {
				System.out.print(matrix2[i][j]+ "\t");
			}
			System.out.println();
		}
		
	
		System.out.println("Display Matrix");
		for(int i = 0; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(sum[i][j]+"\t" );
			}
			System.out.println();
		}
	}
}
*/
























