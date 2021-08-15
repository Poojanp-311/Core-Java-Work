
public class Product_Objects {
     private String product_name;
     private int product_id;
     private int price;
	public Product_Objects(String product_name, int product_id, int price) {
		super();
		this.product_name = product_name;
		this.product_id = product_id;
		this.price = price;
	}
	public String getProduct_name() {
		return product_name;
	}
	public int getProduct_id() {
		return product_id;
	}
	public int getPrice() {
		return price;
	}

	
     
}
