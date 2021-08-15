
public class Fruit implements Comparable<Fruit>{

	String name;
	Integer calories;
	Integer price;
	String color;
	public Fruit(String name, Integer calories, Integer price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int compareTo(Fruit p){
		return p.getCalories().compareTo(this.getCalories()); // Descending order
	}
	
	
}
