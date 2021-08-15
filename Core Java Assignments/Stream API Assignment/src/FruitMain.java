import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Fruit> list = new ArrayList<Fruit>();
       Fruit f=new Fruit("Banana", 200, 150, "Yellow");
       Fruit f1=new Fruit("Per", 40, 80, "Green");
       Fruit f2 = new Fruit("Cherry", 70, 220, "Red");
       Fruit f3=new Fruit("Apple", 50, 120, "Red");
       
        
       list.add(f);
       list.add(f1);
       list.add(f2);
       list.add(f3);
       
       
      
       
       
       // 1) 
      list.stream()
      .filter(p-> p.getCalories()<100)
      .sorted(Comparator.comparing(Fruit::getCalories).reversed())
      .forEach(p->System.out.println(p.getName())); 
       
     // 2)
      System.out.println();
      list.stream()
      .forEach(p-> System.out.println(p.getName() + " " + p.getColor()));
      
      // 3) 
      System.out.println();
      list.stream()
      .filter(p-> p.getColor().equals("Red"))
      .sorted(Comparator.comparing(Fruit::getPrice))
      .forEach(p-> System.out.println(p.getName())); 
      
      
     
 
      
	}

}
