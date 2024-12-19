package day14;

public class Bank {
	private int accountNum = 897654321;
	private double balance = 50000;
	private String name = "Vaishu";
	private int pin = 2233;
	
	public Bank() {
		super();
	}
	
	public Bank(int accountNum, double balance, String name, int pin) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
		this.pin = pin;
	}

	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Bank [accountNum=" + accountNum + ", balance=" + balance + ", name=" + name + ", pin=" + pin + "]";
	}
	
	

}
