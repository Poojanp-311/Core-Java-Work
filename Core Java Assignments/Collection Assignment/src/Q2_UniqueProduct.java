import java.util.HashSet;
import java.util.Iterator;


public class Q2_UniqueProduct {
	//public static class HashMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashSet<Product_Objects> set = new HashSet<Product_Objects>();
      
      Product_Objects p1 = new Product_Objects("Apple",101,1000);
      Product_Objects p2 = new Product_Objects("Mi",102,2000);
      Product_Objects p3 = new Product_Objects("Microsof",103,50000);
      Product_Objects p4 = new Product_Objects("Sunsilk",104,14000);
      Product_Objects p5 = new Product_Objects("Loreal",105,14000);
      Product_Objects p6 = new Product_Objects("Realme",106,8700);
      Product_Objects p7 = new Product_Objects("Samsung",107,8900);
      Product_Objects p8 = new Product_Objects("Nokia", 108,7800);
      Product_Objects p9 = new Product_Objects("Moto",109,5400);
      Product_Objects p10 = new Product_Objects("iPHONE",110,60000);
      //Product_Objects p11 = new Product_Objects("iPHONE",110,60000);
      
      set.add(p1);
      set.add(p2);
      set.add(p3);
      set.add(p4);
      set.add(p5);
      set.add(p6);
      set.add(p7);
      set.add(p8);
      set.add(p9);
      set.add(p10);
      set.add(p10);
      
     
      
      
      
     /*erator<String> itr= set.iterator();
      while(itr.hasNext()){
    	 // String data = itr.next();
    	  System.out.println(itr.next());
      }*/
      
      /*for(Product_Objects p: set){
    	  System.out.println("productName: "+ p.product_name + "productID: "+ p.product_id+ "Price: "+ p.price);
      }*/
      
      for(Product_Objects p: set){
    	  System.out.println("productName: " + p.getProduct_name() + " productID: "+ p.getProduct_id()+ " Price: " + p.getPrice());
      }
      
      
 
      
	}
	//}
}
