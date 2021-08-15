import java.util.Scanner;
public class Q4_result {
	public static void main(String args[]){
		
	
   int a,b,c;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter first subject marks");
   a=sc.nextInt();
   System.out.println("enter second subject marks");
   b=sc.nextInt();
   System.out.println("enter third subject marks");
   c=sc.nextInt();
   
   if(a>60 && b>60 && c>60){
	   System.out.println("Passed");
   }else if(a>60 && b>60 || b>60 && c>60 || a>60 && c>60){
	   System.out.println("Promoted");
   }else if((a>60 || b>60 || c>60) || (a<60 && b<60 && c<60)){
	   System.out.println("Failed");
   }
   
}
}
