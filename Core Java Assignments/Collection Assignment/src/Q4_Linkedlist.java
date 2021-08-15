
import java.util.Iterator;
import java.util.LinkedList;


public class Q4_Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<MyDate> d = new LinkedList<MyDate>();
     MyDate d1 = new MyDate(23, 12, 2001);
     
     System.out.print("Your date of birth is "+ d1.getDate()+"-" + d1.getMonth()+"-" + d1.getYear());
    int y = d1.getYear();
    if((y%4==0 && y%100!=0) || y%400==0){
    	System.out.println("and it was a leap year.");
    }else{
    	System.out.println(" and it was not a leap year.");
    }
     
    MyDate d2 = new MyDate(23, 12, 2000);
    System.out.print("Your date of birth is "+ d2.getDate()+"-" + d2.getMonth()+"-" + d2.getYear());
    int y1 = d2.getYear();
    if((y1%4==0 && y1%100!=0) || y1%400==0){
    	System.out.println("and it was a leap year.");
    }else{
    	System.out.println(" and it was not a leap year.");
    }
     
    Iterator<MyDate> itr = d.iterator();
    while(itr.hasNext()){
    	System.out.println(itr.next());
    }
     
	}

}
