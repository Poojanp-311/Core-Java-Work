import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Q5_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> list = Arrays.asList("Poonam", "om", "omkar", "janvai", "akshata");
		List<String> list = new ArrayList<>();
		list.add("Poonam");
		list.add("om");
		list.add("omkar");
		list.add("janvi");
		list.add("akshata");
		
		
		
		/*StringBuilder sb = new StringBuilder();
		for(String s: list) {
         sb.append(s.charAt(0));
		}
		System.out.println("The new string: "+ sb);
		*/
		
		StringBuilder sb = new StringBuilder();
		forEach(list, s->sb.append(s.charAt(0)));
		
		System.out.println(sb);
		
	}

	static<String> void forEach(List<String> list, Consumer<String> consumer) {
		for(String s: list) {
			
				consumer.accept(s);
			
		}
		
		
	}

}
