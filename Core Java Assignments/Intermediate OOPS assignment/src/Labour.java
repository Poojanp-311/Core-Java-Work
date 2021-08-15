
public class Labour extends Employee {
int overtime;
/*Labour(){
	overtime =0;
}*/
Labour(String n1, int sal, int ot)
{
     super(n1, sal);
     this.overtime = ot;
}
int getSalary()
{
     return (super.getSalary()+overtime);
}
}