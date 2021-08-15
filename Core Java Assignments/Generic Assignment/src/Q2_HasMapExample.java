import java.util.HashMap;
import java.util.Map;

/*class HashMapex<K, V>{
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	
}
*/

public class Q2_HasMapExample {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //HashMapex<Integer, Double> hp = new HashMapex<Integer, Double>();
		
       HashMap<Integer, Double> map = new HashMap<Integer, Double>();
       map.put(1, 10.1);
       map.put(2, 10.2);
       map.put(3, 10.3);
       map.put(4, 10.4);
       map.put(15, 10.5);
       map.put(6, 10.6);
       map.put(7, 10.7);
       map.put(8, 10.8);
       map.put(9, 10.9);
       map.put(10, 10.10);
       
       for(Map.Entry m : map.entrySet()){
     System.out.println(m.getKey()+ " "+ m.getValue());  
	}
	}

}
