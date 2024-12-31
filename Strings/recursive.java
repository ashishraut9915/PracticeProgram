package String;

public class recursive{
	   public static void main(String args[]){
	      String str1 = "TPisTPareTPamTP", str2 = "TP";
	      System.out.println("Count of occurrences of a substring recursively are: "+subsrting_rec(str1, str2));
	   }
	   static int subsrting_rec(String str, String sub){
	      if (str.contains(sub)){
	         return 1 + subsrting_rec(str.replaceFirst(sub, ""), sub);
	      }
	      return 0;
	   }
	}
