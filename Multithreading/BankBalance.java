import java.lang.*;
class BankBalance
{
	static class BankAccount
	{
		private int balance=10000;
		
		public int getBalance()
		{
			return balance;
		}
		
		public synchronized void withdraw(int amount)
		{
			if(amount<=balance)
			{
				balance= balance-amount;
				System.out.println(Thread.currentThread().getName() + " withdrew: " +amount);
				System.out.println(" Remaining balance : " + balance);
			}else
			{
				System.out.println(Thread.currentThread().getName()+" Please provide lesser amount then ur bank balance");
			}
		}
	}
	public static void main(String args[]) throws Exception
	{
		BankAccount account = new BankAccount();
		
		Thread t1 = new Thread(() -> {
		  account.withdraw(7000);
		  },"Thread-1");
		  
		Thread t2 = new Thread(() -> {
		  account.withdraw(7000);
		  },"Thread-2");
		  
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		 System.out.println("Final Balance: " + account.getBalance());
	}
}
		
	