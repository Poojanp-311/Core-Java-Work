import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)


@interface Info{
	int AuthorId();
	String Date();
	String Time();
	int Version();
}


@Info(AuthorId=101, Date="10-08-2021", Time="13:43", Version=6)
class Author{
	
	/*public void show(){
		System.out.println("Hello");
	}*/
	String AuthorName;
	String Supervisor;
	String Description;
	public Author(String authorName, String supervisor, String description) {
		super();
		AuthorName = authorName;
		Supervisor = supervisor;
		Description = description;
	}
	
}



public class Q2_infoannotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Author a = new Author("Richard", "Thomas", "This class is about Authorname,supervisor etc...");
  System.out.println(a.AuthorName + " "+ a.Supervisor + " " +a.Description);
  Class c = a.getClass();
  Annotation an = c.getAnnotation(Info.class);
  Info i = (Info)an;
  
  System.out.println(i.Date()+"\n" + i.Time()+ "\n" + i.AuthorId() + "\n" + i.Version());
	}

}
