
public class Manager extends Employee {
int incentive;
/*Manager(){
	incentive=0;
}*/
Manager(String n, int sal, int i)
{
     super(n, sal);
     this.incentive = i;
}
int getSalary()
{
     return (super.getSalary()+incentive);
}
}
