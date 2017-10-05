package bank;

public class Account
{
	private String number;
	private double balance;
	
	public Account(String number, double balance)
	{
		this.number = number;
		this.balance = balance;
	}
	
	public Account() {
		this("7777", 1e6);
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public synchronized void deposit(double value) {
		this.balance += value;
	}
	
	public synchronized void withdraw(double value) {
		this.balance -= value;
	}
	
	@Override
	public String toString() {
		return String.format("Conta: %s, %f", this.number, this.balance);
	}
	
	@Override
	public int hashCode() {
        return this.number.hashCode();
	}
}
