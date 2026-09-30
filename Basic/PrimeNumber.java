import java.lang.*;
import java.util.*;
class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter  number: ");
		int a= sc.nextInt();
		
		if(a==2)
		{
			System.out.println("It is  a prime number "+a);
		}else{
			boolean isPrime=true;
			for(int i=2;i<=Math.sqrt(a);i++)
		   {
			   if(a%i==0)
			   {
			      isPrime= false;
			   }
		   }
		   if(isPrime==true)
		   {
			   System.out.println("It is  a prime number "+a);
		   }else{
			   System.out.println("It is not a prime number "+a);
		   }
		}
	}
}