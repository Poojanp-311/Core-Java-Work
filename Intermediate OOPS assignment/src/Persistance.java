
abstract class persistance{
    public abstract void persist();
    public void display(){
    	System.out.println("The display method is in abstract class");
    }
}

class FilePersistance extends persistance{
	public void persist(){
		System.out.println("filepersistance");
	}
}

class DatabasePersistance extends persistance{
	public void persist(){
		System.out.println("Database persistance");
	}
}



