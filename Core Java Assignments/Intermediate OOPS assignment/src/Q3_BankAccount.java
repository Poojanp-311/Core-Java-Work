class account{
	int amount;
	account(){
		amount=0;
	}
    account(int amount){
		this.amount = amount;
	}
	public int getAmount(){
		return amount;
	}
}

class SavingAccount extends account{
	int fixDeposit;
	SavingAccount(){
		super();
	}
	SavingAccount(int fixDeposit){
		super(fixDeposit);
	}
	private int getFixDeposit(){
		return (super.getAmount());
	}
	
}
class CurrentAccount extends account{
	int cash;
	CurrentAccount(){
		super();
	}
	CurrentAccount(int cash){
		super(cash);
	}
	private int getCash(){
		return (super.getAmount());
	}
}



class Q3_BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount(50000);
		CurrentAccount ca = new CurrentAccount(20000);
		System.out.println("Saving account fixed deposit is "+ sa.getAmount());
		System.out.println("Current account balance is "+ ca.getAmount());
		int sum = sa.getAmount()+ca.getAmount();
		System.out.println("Total amount in the bank is "+ sum);

	}

}
