package String;

public class StringFormatter {  
public static String reverseWord(String str){  
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  

public static void main(String[] args) {  
    System.out.println(StringFormatter.reverseWord("my name is Ashish"));  
    System.out.println(StringFormatter.reverseWord("my name is Chetan"));    
    }  
}