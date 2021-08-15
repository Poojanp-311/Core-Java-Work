
public class Pair<V, K> {
 
     private V value;
     private K key;
	/*public Pair(V value, K key) {
		super();
		this.value = value;
		this.key = key;
	}*/
	public V getValue() {
		return value;
	}
	
	public K getKey() {
		return key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public void setKey(K key) {
		this.key = key;
	}
	

	
     
}
