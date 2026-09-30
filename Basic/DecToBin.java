import java.lang.*;
import java.util.*;
class DecToBin
{
	public static void decToNum(int num)
	{
		int myNum= num;
		int pow=0;
		int binNum=0;
		
		while(num>0)
		{
			int lastDigit= num%2;
			binNum = binNum + (lastDigit * (int)Math.pow(10,pow));
			pow++;
			num = num/2;
		}
		System.out.println("Binary form of " + myNum + "=" + binNum);
	}	
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		
		decToNum(num);
	}
}

/*Enter a number:
14
Binary form of 14=1110

*/