package String;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		
		String str = "Re move Wh ite S  paces" ;
		System.out.println("Original Sentence = "+str);
		
		 str = str.replaceAll("\\s", "");
		 System.out.println("After Replacement = "+ str);
	}
}
