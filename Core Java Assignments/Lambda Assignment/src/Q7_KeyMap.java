import java.util.HashMap;
import java.util.Map;

public class Q7_KeyMap {
  
	
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Pooja");
		map.put(2, "akshata");
		map.put(3, "anita");
		map.put(4, "ashwini");
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry m : map.entrySet()){
		     sb.append(" key: "+ m.getKey()+ ","); 
		     sb.append(" value: "+ m.getValue() + "," );
		     
			}
		System.out.println(sb);
		
	}
}
