
public class Account {
	private String acc_Name;
	private String acc_Number;
	private String acc_Type;
	private double acc_Balance;

	public Account(String acc_Name, String acc_Number, String acc_Type, double acc_Balance) {
		super();
		this.acc_Name = acc_Name;
		this.acc_Number = acc_Number;
		this.acc_Type = acc_Type;
		this.acc_Balance = acc_Balance;
	}
	public void Deposit(double amount){
		this.acc_Balance+=amount;
	}
	public void Withdraw(double amount){
		if(this.acc_Balance<amount){
			System.out.println(" Not Enough Money!!");
		}
		else{
			this.acc_Balance-=amount;
		}
	}
	public void displayNameAmount(){
		System.out.println("Account Holder Name : "+this.acc_Name);
		System.out.println("Balance : "+this.acc_Balance);
	}
	

}
