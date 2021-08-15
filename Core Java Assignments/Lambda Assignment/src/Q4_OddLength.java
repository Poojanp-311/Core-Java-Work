import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Q4_OddLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list = new ArrayList<>();
        
        	list.add("Pooja");
        	list.add("Akshataa");
        	list.add("Poonam");
    		list.add("om");
    		list.add("omkar");
    		list.add("janvi");
    		
    		/*for(String s: list) {
    			if(s.length()%2==0) {
    				System.out.println(s);
    			}
    		}*/
    		
    	
    		
    		list.removeIf(s-> s.length()%2!=0);
    		
    		for(String s: list) {
    			System.out.println(s);
    		}
    		
    			
	}

}
