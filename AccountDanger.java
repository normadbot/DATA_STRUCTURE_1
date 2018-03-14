import java.lang.*;
import java.util.*;

class Account {
	private int balance = 50;
	public int getBalance(){
		return balance;
	}
	public void withdraw(int ammount){
		if(ammount > balance){
			System.out.println(Thread.currentThread().getName()+" is unable to Withdraw");
		}
		
		balance = balance-ammount;
	}
}

public class AccountDanger implements Runnable {
	private Account acct = new Account();
	
		@Override
		public void run(){
			//for(int x=0;x<5;x++){
				
				makeWithdrawal(40);
				if(acct.getBalance()<0){
					System.out.println("Account is Overdrawn");
				}
				
			//}
		}	
		
		private synchronized void makeWithdrawal(int amt){
			if(acct.getBalance()>=amt){
				System.out.println(Thread.currentThread().getName()+" is going to Withdraw");	
				acct.withdraw(amt);
				System.out.println(Thread.currentThread().getName()+" completes Withdrawal");
			} else {
				System.out.println("Not enough in Account for "+Thread.currentThread().getName()+" to Withdraw "+acct.getBalance());
			}
			
		}
		
		public static void main(String [] args ) {
			AccountDanger r1 = new AccountDanger();
			AccountDanger r2 = new AccountDanger();
			
			Thread one = new Thread(r1);
			Thread two = new Thread(r1);
			one.setName("fred");
			two.setName("Lucy");
			one.start();
			two.start();	
		}
	
}