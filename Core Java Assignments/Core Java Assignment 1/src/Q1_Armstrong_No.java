import java.util.Scanner;
public class Q1_Armstrong_No {
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number");
		n=sc.nextInt();
		int rem, sum=0;
		int temp=n;
		while(temp>0){
			rem=temp%10;
			sum=sum+rem*rem*rem;
			temp=temp/10;
		}
		if(n==sum){
			System.out.println(n+ " is armstrong number");
			
		}else{
			System.out.println(n+ " is not armstrong number");
		}
	}

}
