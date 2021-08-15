
public class Q1_ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		MyAdd addition= (int a, int b)-> a+b;
		System.out.println("Addition: "+ addition.Add(2, 4));
		
		MySub subtraction= (int a, int b)-> a-b;
		System.out.println("Subtraction: "+ subtraction.sub(20, 4));
		
		MyMulti multiplication= (int a, int b)-> a*b;
		System.out.println("Multiplication: "+ multiplication.mul(10, 4));
		
		MyDiv divison= (int a, int b)-> a/b;
		System.out.println("Divison: "+ divison.mul(10, 2));
	}
	
	
	
	@FunctionalInterface
	interface MyAdd{
		int Add(int a, int b);		
	}
	
	interface MySub{
	int sub(int a, int b);
	}
	
	interface MyMulti{
		int mul(int a, int b);
		}
	
	interface MyDiv{
		int mul(int a, int b);
		}
	
	
}

