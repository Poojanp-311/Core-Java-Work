
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager("Nikhil",20000,1500);
        System.out.println("Salary of Manager= "+m1.getSalary());
        Labour l1 = new Labour("Manoj", 15000, 300);
        System.out.println("Salary of Labour= "+l1.getSalary());
        int sum = m1.getSalary() + l1.getSalary();
        System.out.println("Salary of the employees: " +sum);
	}

}
