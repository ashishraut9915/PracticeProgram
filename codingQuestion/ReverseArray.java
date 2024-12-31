package codingQuestion;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		int rev = 0 ;
		
		/*for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i]+" ");
			

		}
		System.out.println("\n");*/
		System.out.println("Array in rev order \n");
		
		for(int i = arr.length-1; i>=0 ; i--) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
