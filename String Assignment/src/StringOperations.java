
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java String pool refers to collections of Strings which are stored in heap memory";
        /* 1) lower case conversion */
		String lower = str.toLowerCase();
        System.out.println(lower);
        
        /* 2) uppercase conversion */
        String upper = str.toUpperCase();
        System.out.println(upper);
        
        /* 3) replacing with another character */
        String replaced = str.replace('a', '$');
        System.out.println(replaced);
        
        /* 4) check for given word */
        System.out.println(str.contains("collection"));
        
        /* 5) string matching */
        String str1 = "java string pool refers to collections of strings which are stored in heap memory";
         if(str.equals(str1)){
        	 System.out.println("True");
         }else{
        	 System.out.println("False");
         }
         
         /* 6) string matching */
         String str2 = new String("java string pool refers to collections of strings which are stored in heap memory");
         if(str.equals(str2)){
        	 System.out.println("True");
         }else{
        	 System.out.println("False");
         }
         
         
	}

}
