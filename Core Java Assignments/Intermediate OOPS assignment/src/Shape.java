
abstract class Shape {
	int length, breadth;
	public void shape(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
    public abstract void draw();
}


class rectangle extends Shape{
	
	
	
	public void draw(){
		//int area=length*breadth;
		System.out.println("Draw rectangle");
	}
}

class line extends Shape{
	public void draw(){
		System.out.println("Draw line");
	}
}

class Cube extends Shape{
	public void draw(){
		System.out.println("Draw cube");
	}
}


