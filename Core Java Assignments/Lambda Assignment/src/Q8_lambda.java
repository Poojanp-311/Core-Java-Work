import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Q8_lambda extends Thread{

	public void run() {
		System.out.println("Running method");
	}
	public static void main(String args[]) {
	Q8_lambda l = new Q8_lambda();
	l.start();
	
	List<String> list1 = new ArrayList<String>();
	list1.add("101");
	list1.add("102");
	list1.add("103");
	list1.add("104");
	list1.add("105");
	
Consumer<List<Integer>>print = list-> list.stream().forEach(a-> System.out.println(a + ""));
	
	list1.forEach(p-> System.out.println(p));
}
}
