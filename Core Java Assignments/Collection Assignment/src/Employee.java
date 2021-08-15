import java.util.Scanner;


public class Employee implements Comparable<Employee>{
   private Integer id;
   private String name;
   private String dept;
   private int salary;
public Employee(int id, String name, String dept, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.salary = salary;
}
public Integer getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}



    
   public int compareTo(Employee o){
	   
	   if(id>o.id){
		   return 1;
	   }else if(id<o.id){
		   return -1;
	   }else{
		   return 0;
	   }
	   
   }
}
