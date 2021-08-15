import java.util.Scanner;
public class Q5_IncomeTax {
  public static void main(String args[]){
		  Scanner sc=new Scanner(System.in);
		  int income,tax_amount,tax, sum;
		  System.out.println("enter income amount");
		  income=sc.nextInt();
		  if(income<=180000){
			  tax=0;
			  sum=((income/100)*tax);
			  System.out.println("tax_amount:" +sum);
		  }
		  else if(income>=181001 && income<=300000){
			  tax=10;
			  sum=((income/100)*tax);
			  System.out.println("tax_amount:" +sum);
		  }
		  else if(income>=300001 && income<=500000){
			  tax=20;
			  sum=((income/100)*tax);
			  System.out.println("tax_amount:" +sum);
		  }
		  else if(income>=500001 && income<=1000000){
			  tax=30;
			  sum=((income/100)*tax);
			  System.out.println("tax_amount:" +sum);
		  }

	
  }
}
