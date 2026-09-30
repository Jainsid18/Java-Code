import java.lang.*;
import java.util.*;
 class Circle1
{
	public double radius;
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	
	public double circumference()
	{
		return perimeter();
	}
}
	
public class Circle
{
	public static void main(String args[])
	{
		Circle1 c1=new Circle1();
		c1.radius=7;
		
		System.out.println("Area is : " + c1.area());
		System.out.println("Perimeter is: " + c1.perimeter());
		System.out.println("Circumference is : " + c1.circumference());
	}
}

