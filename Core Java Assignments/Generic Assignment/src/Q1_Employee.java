import java.util.HashSet;
public class Q1_Employee{
public static class HashMain{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashSet<EmployeeHashset> set = new HashSet<EmployeeHashset>();
   
   EmployeeHashset e1 = new EmployeeHashset(1, "Pooja", 20000, "SWE");
   EmployeeHashset e2 = new EmployeeHashset(2, "Akshata", 15000, "Pharma");
   EmployeeHashset e3 = new EmployeeHashset(3, "Anita", 10000, "Accounts");
   //EmployeeHashset e4 = new EmployeeHashset(3, "Anita", 10000, "Accounts");
   
   set.add(e1);
   set.add(e2);
   set.add(e3);
   //set.add(e4);
   
    for(EmployeeHashset e: set){
    	System.out.println("id: "+ e.id+ " "+ "Name: " +e.name + " "+ "Salary: "+e.salary + " " + "Dept: "+e.dept);
    }
  
   
	}
}
}

