import java.util.Date;
public class Q4_Property{
	public static void main(String args[]){
     
		// a.
	//Pair<String, String> p1 = new Pair<String, String>("Pooja", "123");
	Pair<String, String> p1 = new Pair<String, String>();
	p1.setValue("akshu");
	p1.setKey("154");
	System.out.println(p1.getValue());
	System.out.println(p1.getKey());
	
	// b.
	
	Pair<Date, String> p2 = new Pair<Date, String>();
	p2.setKey("Today is");
	p2.setValue(new java.util.Date());
	System.out.print(p2.getKey());
	System.out.println(" "+p2.getValue());
}
}
