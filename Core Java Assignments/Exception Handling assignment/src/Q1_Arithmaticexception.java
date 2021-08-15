
import java.util.Scanner;
public class Q1_Arithmaticexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        try{
        	int result = a/b;
        	System.out.println(result);
        }catch(ArithmeticException e){
        	System.out.println("Error: "+e.getMessage());
        }
        System.out.println("program terminated");
	}  

}
