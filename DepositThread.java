package Session8_Assignment3;

import java.util.Scanner;

import Session8_Assignment3.SavingsAccnt;

public class DepositThread extends Thread{
	SavingsAccnt sd ;
	//This method initializes data member.
	public DepositThread(SavingsAccnt sd) {
		
		this.sd = sd;
	}

	@Override
	//This method will be called by start method
	public void run() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);  
	     
		  System.out.println("Thread 1:Enter the amt to deposit");  
		  int amt=sc.nextInt();  
		   
		 sd.deposit(amt);
		//sd.depositUnsync(amt);
	}


 
}
