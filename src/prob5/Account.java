package prob5;

public class Account
{
	private String accountNo;
	private int balance;
		
	public Account(String account)
	{
		this.accountNo = account;
	}
	
	public void save(int balance)
	{
		this.balance += balance;
	}
	
	public void deposit(int balance)
	{
		if(this.balance < balance)
		{
			System.out.println("잔고가 없습니다.");
			return;
		}
		this.balance -= balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}
}