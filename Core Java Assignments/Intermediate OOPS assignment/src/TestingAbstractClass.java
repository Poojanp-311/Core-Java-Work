

abstract class test
{
	abstract void display();
	void show(){
		System.out.println("welcome");
	}
		 
}

final class check extends test{
	void display(){
		System.out.println("hello");
	}
}



public class TestingAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //test t = new test();
		check c= new check();
		c.display();
		c.show();
		
		
	}

}
