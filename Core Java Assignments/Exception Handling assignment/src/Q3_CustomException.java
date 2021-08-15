
class Q3_CustomException 
	{
		public static void main(String args[]) 
		{ 
			Account acc = new Account(); 
			System.out.println("Current balance : " + acc.balance()); 
			System.out.println("Withdrawing 200"); acc.withdraw(200); 
			System.out.println("Current balance : " + acc.balance()); 
			acc.withdraw(1000); 
		} 
	}