import java.util.Scanner;
import java.util.TreeSet;


public class Q3_SortedEmployee {

	public static void main(String[] args) {
		System.out.println("Choose any option:");
		 System.out.println("a.id" + "\n"+ "b.name" +"\n" + "c.dept" + "\n" + "d.salary");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice");
		String choice = sc.nextLine();
		// TODO Auto-generated method stub
        TreeSet<Employee> tset = new TreeSet<>();
        
        Employee e1 = new Employee(1, "Pooja", "Electronics", 15000);
        Employee e2 = new Employee(2, "Navya", "Computers", 20000);
        Employee e3 = new Employee(3, "Aditi", "Civil", 10000);
        
        tset.add(e1);
        tset.add(e2);
        tset.add(e3);
        
      
        switch(choice){
        case "a": 
        	for(Employee o: tset){
        		System.out.println("id is: "+ o.getId()+ " name is: "+ o.getName()+ " dept is: "+ o.getDept()+ " salary is: "+ o.getSalary());
        	}
        	break;
        case "b":
        	for(Employee o: tset){
        		System.out.println("name is: "+ o.getName()+ " id is: "+ o.getId()+ " dept is: "+ o.getDept()+ " salary is: "+ o.getSalary());
        	}
        	break;
        case "c":
        	for(Employee o: tset){
        		System.out.println("dept is: "+ o.getDept()+ " name is: "+ o.getName()+ " id is: "+ o.getId()+  " salary is: "+ o.getSalary());
        	}
        	break;	
        case "d":
        	for(Employee o: tset){
        		System.out.println( "salary is: "+ o.getSalary()+ "name is: "+ o.getName()+ "id is: "+ o.getId()+ "dept is: "+ o.getDept() );
        	}
        	break;		
        }
        sc.close();
	}

}
