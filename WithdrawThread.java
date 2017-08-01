package Session8_Assignment3;

import java.util.Scanner;

import Session8_Assignment3.DepositThread;
import Session8_Assignment3.SavingsAccnt;


	public class WithdrawThread extends Thread{
		SavingsAccnt s;
		DepositThread dt;
	public WithdrawThread(SavingsAccnt s, DepositThread dt) {
		
		this.s = s;
		this.dt = dt;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
	     
		   System.out.println("Thread 2:Enter the amt to withdraw");  
		   int amt=sc.nextInt();
		   s.withdraw(amt);
		   //s.withdrawUnsync(amt);uncomment this to check the output without synchronized method.
	};
		

	}

