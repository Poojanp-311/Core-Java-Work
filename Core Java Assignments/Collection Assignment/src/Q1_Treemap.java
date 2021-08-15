import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Q1_Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeMap<Long, Contact> map = new TreeMap<Long, Contact>();
    
    map.put((long)812254689, new Contact(812254689, "Pooja", "pooja12@gmail.com", "Female"));
    map.put((long)810051690, new Contact(810051690, "AKSHU", "akshu12@gmail.com", "Female"));
    
    Set<Entry<Long, Contact>> entrySet = map.entrySet();
    for(Entry<Long, Contact> entry: entrySet){
    	System.out.println("Key: "+ entry.getKey());
    	System.out.println("Value: "+entry.getValue());
    }
	}

}
