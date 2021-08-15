import java.lang.annotation.Annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)


@interface Execute{
	int Sequence();
}



class MyClass{
@Execute(Sequence=1)
	public void MyMethod1(){
	System.out.println("This should be executed on 1st line");
}

@Execute(Sequence=2)
public void MyMethod2(String message){
	System.out.println("This should be executed on 2nd line");
}
@Execute(Sequence=3)
public void MyMethod3(String message){
	System.out.println("This shoul be executed on 3rd line");
}
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     MyClass m = new MyClass();
     
      Class<?> classObj = m.getClass();
      
     Method MyMethod1 = classObj.getDeclaredMethod("MyMethod1");
     Method MyMethod2 = classObj.getDeclaredMethod("MyMethod2", String.class);
     Method MyMethod3 = classObj.getDeclaredMethod("MyMethod3", String.class);
     
     try{
    	 MyMethod1.invoke(m);
    	 MyMethod2.invoke(m, "");
    	 MyMethod3.invoke(m, "");
     }catch(InvocationTargetException e){
    	 System.out.println(e.getCause());
     }



	}

}

