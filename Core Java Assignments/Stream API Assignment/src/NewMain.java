import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<News> list1 = new ArrayList<News>();
	       News n = new News(101, "soap add", "This is advertisement", "good one" );
	       News n1 = new News(101, " Om Jwellory", "This is jwellory advertisement", "in budget" );
	       News n2 = new News(101, "chocolate", "Chocolate is love", "Interesting" );
	       list1.add(n);
	       list1.add(n1);
	       list1.add(n2);
	       
	       // 4)
	       int l = 0;
	    for(News i:list1) {
	   		if(i.getComment().length()>l) {
	   			l=i.getComment().length();
	   		}
	   	}
	   	for(News i:list1) {
	   		if(i.getComment().length()==l) {
	   			System.out.println(i.getNewsId());
	   		}
	   	}
	       // 5)
	     System.out.println();
	      long count = list1.stream()
	       .filter(p->p.getComment().toLowerCase().contains("Budget".toLowerCase()))
	       .count();
	     System.out.println("The count of word budget: "+ count);
	     
	     // 6)
	     System.out.println();
	     List<String> com=new ArrayList<String>();
	 	for(News i:list1) {
	 		com.add(i.getCommentByUser());
	 	}
	 	String maxVal = com.stream()
	             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	             .entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
	             .map(Map.Entry::getKey).orElse(null);
	 	System.out.println(maxVal);
	    // 7)
         System.out.println();
         list1.forEach((News)-> {
        	 System.out.println("usercomments: " + News.getCommentByUser() + "," + " Number of comments: "+ News.getComment());
         });
	}

}
