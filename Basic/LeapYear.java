import java.lang.*;
import java.util.*;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter  number: ");
		int a= sc.nextInt();
		
		if(a%4==0)
		{
			if(a%100==0)
			{
				if(a%400==0)
				{
					System.out.println("It is a leap year");
				}else{
					System.out.println("It is not a leap year");
				}
			}else{
				System.out.println("It is  a leap year");
			}
		}else{
			System.out.println("It is not a leap year");
		}			
	}
}