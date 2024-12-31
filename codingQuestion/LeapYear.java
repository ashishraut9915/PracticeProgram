package codingQuestion;

public class LeapYear {
	
	boolean isLeapYear = false;
	
	public void year(int year) {
		if((year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0)) {
			isLeapYear = true;
		}
		
		
		if(isLeapYear) {
			System.out.println(year + " is a leap year.");
		}else {
			System.out.println(year + " is not leap year");
		}
	}
			
	
	public static void main(String[] args) {
		
		LeapYear yp = new LeapYear();
		
		yp.year(2024);
	}

}
