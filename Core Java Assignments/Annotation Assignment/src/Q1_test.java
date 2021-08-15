import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String name();
	int length();
}
@Test(name="pooja", length=5)
class TestCase{
	
	public void show(){
		System.out.println("This method is for test-case");
	}

}

public class Q1_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TestCase t = new TestCase();
     t.show();
     Class c = t.getClass();
     Annotation an = c.getAnnotation(Test.class);
     Test t1 = (Test)an;
     System.out.println(t1.name());
	}

}
