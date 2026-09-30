import java.lang.*;
import java.util.*;
class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  number: ");
		int a= sc.nextInt();
		
		int rev=0;
		
		while(a>0)
		{
			int lastDigit = a%10;
			rev= (rev*10 )+ lastDigit;
			a= a/10;
		}
		System.out.println("Reverse number is : " + rev);
	}
}
			