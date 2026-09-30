import java.lang.*;
class ProducerConsumer
{
	static class Buffer
	{
		int data;
		boolean available=false;
		
		public synchronized void produce(int value) throws Exception
		{
			while(available)
			{
				wait();
			}
			
			data=value;
			available=true;
			
			System.out.println("Produced:" + data);
			
			notify();
		}
		
		public synchronized void consume() throws Exception
		{
			while(!available)
			{
				wait();
			}
			System.out.println("Consumed:" + data);
			available = false;
			
			notify();
		}			
	}
	
	public static void main(String args[]) throws Exception
	{
		Buffer buffer = new Buffer();
		
		Thread producer = new Thread(() ->{
			for(int i=1;i<=5;i++)
			{
				try{
					buffer.produce(i);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		});
		
		Thread consumer = new Thread(() ->{
			for(int i=1;i<=5;i++)
			{
				try{
					buffer.consume();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		});
		
		producer.start();
		consumer.start();
		
		producer.join();
		consumer.join();
		
		System.out.println("Main method completed");
	}

}
					