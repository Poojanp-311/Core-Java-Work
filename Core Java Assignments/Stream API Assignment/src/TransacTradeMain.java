import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java.util.function.Function;

public class TransacTradeMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List<Trader> t = new ArrayList<Trader>();
          Trader t1 = new Trader("Pooja", "Kandivali");
          Trader t2 = new Trader("Akshata", "Delhi");
          Trader t3 = new Trader("Anita", "Indore");
          Trader t4 = new Trader("Ashwini", "Pune");
          Trader t5 = new Trader("Ankita", "Pune");
          
          t.add(t1);
          t.add(t2);
          t.add(t3);
          t.add(t4);
          t.add(t5);
          
          List<Transaction> tr = new ArrayList<Transaction>();
          Transaction tr1 = new Transaction(t1, 2010, 400);
          Transaction tr2 = new Transaction(t2, 2011, 100);
          Transaction tr3 = new Transaction(t3, 2011, 600);
          Transaction tr4 = new Transaction(t4, 2014, 200);
          Transaction tr5 = new Transaction(t5, 2014, 300);
          
          tr.add(tr1);
          tr.add(tr2);
          tr.add(tr3);
          tr.add(tr4);
          tr.add(tr5);
          
          
          // 8)
          tr.stream()
          .filter(r->r.getYear()==2011)
          .sorted(Comparator.comparing(Transaction::getValue))
          .forEach(n-> System.out.println(n.getTrader()));
          
          
          // 9)
          System.out.println();
         List<Trader> distinctElements = t.stream().filter(distinctByKey(cust->cust.getCity()))
          .collect(Collectors.toList());
          System.out.println("Unique city: " + distinctElements);
          
          // 10)
          System.out.println();
          t.stream()
          .filter(r-> r.getCity().matches("Pune"))
          .sorted(Comparator.comparing(Trader::getName))
          .forEach(r-> System.out.println("Name who stay in pune: "+r.getName()));
          
          // 11)
          System.out.println();
          StringBuilder str = new StringBuilder();
          t.stream()
          .sorted(Comparator.comparing(Trader::getName))
          .forEach(Trader -> str.append(Trader.getName()));
          System.out.println("all names in string: " +str);
          
          // 12)
          System.out.println();
          t.stream()
          .filter(f-> f.getCity().matches("Indore"))
          .forEach(System.out::println);
          
          // 13)
          System.out.println();
          t.stream()
          .filter(f-> f.getCity().matches("Delhi"))
          .forEach(System.out::println);
          
          // 14)
          System.out.println();
          Transaction maxvalue = tr.stream()
        		  .max(Comparator.comparingInt(Transaction::getValue))
        		  .get();
          
          System.out.println("Max transaction value is: " + maxvalue.value);
          
          // 15)
          System.out.println();
          Transaction minvalue = tr.stream()
        		  .min(Comparator.comparingInt(Transaction::getValue))
        		  .get();
          
          System.out.println("Min transaction value is: " + minvalue.value);
      }
	
	// for 9)
	 public static<T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
     {
   	  Map<Object, Boolean> s = new ConcurrentHashMap<>();
   	  return t-> s.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
     }

}
