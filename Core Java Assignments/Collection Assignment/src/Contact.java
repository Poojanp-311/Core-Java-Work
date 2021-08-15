
public class Contact {
    private Long  PhoneNumber;
    private String name;
    private String Gmail;
    private String Gender;
    
    /*enum gender{
    	Male, Female
    }
    gender g;*/
	public Contact(long PhoneNumber, String name, String gmail, String gender) {
		super();
		this.name = name;
		this.Gmail = gmail;
		this.Gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public String getGmail() {
		return Gmail;
	}
	public String getGender() {
		return Gender;
	}
	public Long getPhoneNumber() {
		return PhoneNumber;
	}
	
	public String toString(){
		return "Contact [ Name=" + name + ", gamil=" + Gmail + ", gender=" + Gender + "]";
	}
	/*public int compareTo(Contact o){
		return this.getPhoneNumber().compareTo(o.getPhoneNumber()); // ascending order
	}*/
	public int compareTo(Contact o){
		return o.getPhoneNumber().compareTo(this.getPhoneNumber()); // Descending order
	}
	
    
}
