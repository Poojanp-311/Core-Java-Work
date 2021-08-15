import java.util.function.*;
interface Myfunction{
	void method(int a, int b);
}

class Product{
	private double price = 0.0;
	public void setPrice(double price) {
		this.price=price;
	}
	public void printPrice() {
		System.out.println(price);
	}
	}

public class Q3_DifferentInterface {

	public static void main(String[] args) {
		
		//Predicate Interface
		Predicate<String> word = t->t.length()>10;
		String s= "Pooja Palekar";
	    boolean result = word.test(s);
	    System.out.println("Predicate Interface: "+ "\n" + result);
		
	    // Consumer Interface
	    
	    Consumer<Product> updatePrice = p->p.setPrice(10.5);
	    Product P=new Product();
	    updatePrice.accept(P);
	    System.out.println("Consumer Interface: "+ "\n" + "Product price is : ");
	    P.printPrice();
	    
	    // Functinal Interface
	    
	    Myfunction Function= (a,b) -> Math.min(a,b);
	    Function.method(50, 60);
	    System.out.println("Functional interface: "+ "\n" + "Minimum number is: "+50);
	    
	    //Supplier Interface
	    
	    int n = 6;
	    display(()-> n+4);

	}
	static void display(Supplier<Integer> arg) {
		System.out.println("\n" + "Supplier Interface: " + "\n" + "Addition is: " + arg.get());
	}

}
