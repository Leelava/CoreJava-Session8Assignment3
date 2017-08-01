package Session8_Assignment3;

import java.util.Scanner;

import Session8_Assignment3.DepositThread;
import Session8_Assignment3.SavingsAccnt;
import Session8_Assignment3.WithdrawThread;

public class BankApplication {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);  
		     
			   System.out.println(" Enter Account holder's name");  
			   String name = sc.next();
			   System.out.println(" Enter opening balance");
			   int balance=sc.nextInt();
			   	SavingsAccnt sd = new SavingsAccnt(name,balance);
				DepositThread dt = new DepositThread(sd);
				dt.start();// Start running the thread

				WithdrawThread wt = new WithdrawThread(sd,dt);
				wt.start();//start running the thread
		}

	}