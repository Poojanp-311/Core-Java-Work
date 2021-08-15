

	public class Singleton{
		public static void main(String args[]){
			singletonedemo s= singletonedemo.getInstance();
		}
	}
		
		class singletonedemo{
			static singletonedemo s = new singletonedemo();
			
			private singletonedemo(){
				
			}
			public static singletonedemo getInstance(){ // public static singletondemo to get instance of singletondemo  
				return s;
			}
		}
		

