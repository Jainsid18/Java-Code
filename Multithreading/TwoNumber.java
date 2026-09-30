import java.lang.*;
class TwoNumber
{
	public static class Thread1 extends Thread
	{
		public void run()
		{
			for(int i=2;i<=10;i=i+2)
			{
				System.out.println("Even:" + i);
				
				/*try{
					Thread.sleep(1000);
				}
				catch(Exception e){
					System.out.println(e);
				}*/
			}
		}
	}
	public static class Thread2 extends Thread
	{
		public void run()
		{
			for(int i=1;i<=10;i=i+2)
			{
				System.out.println("Odd:" + i);
			}
		}
	}
		
	
	public static void main(String args[]) throws Exception
	{
	    Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		t1.start();
		t2.start();
		
		t1.join();
		System.out.println("Main");
		t2.join();
		System.out.println("Main-method");
		
	}
}