package study.practice.practice12_19;

public class Account {
	
	private String owner;
	private long balance;
	
	
	public void setOwner(String s) {
		this.owner = s;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setBalance(int x) {
		this.balance = x;
	}
	
	public long getBalnce() {
		return this.balance;
	}
	
	Account(){
	}
	
	Account(String owner){
		this.owner = owner;
	}
	Account(long balance){
		this.balance = balance;
	}
	Account(String owner, long balance){
		this.owner = owner;
		this.balance = balance;
	}
	Account(long balance, String owner){
		this.owner = owner;
		this.balance = balance;
	}
	
	public long deposit (long amount) {
		this.balance += amount;
		return amount;
	}
	
	public long withdraw(long amount) { //기본 출금
		
		if(this.balance<amount) {
			System.out.println("잔액이 부족합니니다. 현재 잔액 : " + this.balance);
//			amount = balance;
//			balance=0;
//			return amount;
			return 0;
		}
			
		this.balance -= amount;
		return amount;
	}
	
//	public long withdraw(long amount) { //상한까지 출금
//		while(true) {
//		
//		if(this.balance<amount) {
//			System.out.println("잔액이 부족합니니다. 현재 잔액 : " + this.balance);
//			break;
//		}else {
//			this.balance -= amount;
//		}
//		
//		}
//		return this.balance;
//	}
}
