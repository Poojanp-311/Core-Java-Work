import java.util.ArrayList;
import java.util.List;

public class Q6_UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> list = new ArrayList<>();
	        
     	list.add("pooja");
     	list.add("akshataa");
     	list.add("poonam");
 		list.add("om");
 		list.add("omkar");
 		list.add("janvi");
 		
 		
 		
 		list.replaceAll(l -> l.toUpperCase());
 		System.out.println(list);
 		}
	}


