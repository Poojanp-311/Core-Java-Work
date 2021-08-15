import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Q2_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		
		List<Orders> list = Arrays.asList(
	             new Orders(2000),
	             new Orders(5000),
		         new Orders(10000),
		         new Orders(15000),
		         new Orders(20000)
		         );
		
		
		// in normal way
		
		/*for(Orders o: list) {
			if(o.getOrder_price()>10000) {
				System.out.println(o.getOrder_price());
				System.out.println("order status accepted");
			}
			
		}*/
		
		//printorders(list, o->true); // all list will print
		
		printorders(list, o-> o.getOrder_price()>10000);
		
		
		
	}

	private static void printorders(List<Orders> list, Condition condition) {
		// TODO Auto-generated method stub
		for(Orders o: list) {
			if(condition.test(o)) {
				System.out.println(o.getOrder_price());
				System.out.println("Order accpted");
			}
		}
		
	}
	
	
	
}


interface Condition{  // for printorders
	boolean test(Orders o);
}
