package Session8_Assignment3;

public class SavingsAccnt {

	int balance ;
	String name;
	//creates an account with the given balance;
	public SavingsAccnt(String name,int balance) {
		this.name = name;
		this.balance = balance;
		
	}
	
	// This method holds complete control over account until the deposit operation is completed.
	//It doesnot allow any other operation(withdraw) on this account.This method is made thread safe.
	synchronized void deposit(int amt)
	{
		int temp = balance;
		temp = temp + amt;
		
		try{
			Thread.sleep(2000);
		
			}
		catch(Exception e){
			System.out.println("");
		}
		balance=temp;
		System.out.println("Account balance after deposit " +balance);
	}
	
	// This method holds complete control over account until the withdraw operation is completed.
		
	
	synchronized void withdraw(int amt)
	{
		int temp = balance;
		if (balance >= amt)
		{ 
			temp = temp - amt;
		}
		else {
			System.out.println("Cannot withdraw, Balance is only " +balance);
			return;
			}
		
		try{
			Thread.sleep(2000);
		
		}
		catch(Exception e){
		    System.out.println("");
		}
		balance=temp;
		System.out.println("Account balance after withdrawal " +balance);
	}
	// thread unsafe method.
	public void depositUnsync(int amt)
	{
		int temp = balance;
		temp = temp + amt;
		
		try{
			Thread.sleep(2000);
		
			}
		catch(Exception e){
			System.out.println("");
		}
		balance=temp;
		System.out.println("Account balance after deposit " +balance);
	}
	//method without synchronized which not thread safe
	void withdrawUnsync(int amt)
	{
		int temp =balance;
		if (balance >= amt)
		{ 
			temp = temp - amt;
		}
		else {
			System.out.println("Cannot withdraw, Balance is only " +balance);
			return;
			}
		balance=temp;
		System.out.println("Account balance after withdrawal " +balance);
	}
  
}



