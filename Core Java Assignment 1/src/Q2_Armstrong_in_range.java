import java.util.Scanner;
public class Q2_Armstrong_in_range {
public static void main(String args[]){
	int a = 100;
	int b = 999;
	int sum=0;
	for(int i=a;i<=b;i++){
		int temp=i;
		while(temp>0){
			int rem=temp%10;
			sum=sum+rem*rem*rem;
			temp=temp/10;
		}
		if(i==sum){
			System.out.print(i+ " ");
		}
		sum=0;
	}
}
}
