
import java.util.Scanner;

public class Q6_login {

	public static void main(String[] args) {
		int attempts=0;
		String username="abc";
		String password="abc123";
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("Enter username:");
			String UN=scan.next();
			System.out.println("Enter Password:");
			String PW=scan.next();
			if("abc".equals(UN) && "abc123".equals(PW)) {
				System.out.println("WELCOME...!");
				//abbreak;
			}
			else {
				attempts++;
				System.out.println("Please enter correct username and password");
				System.out.println("Number of attempts left:"+(3-attempts));
			}
			if(attempts==3) {
				System.out.println("Contact Admin");
				break;
			}
		}
	}
}