package yamuna.factorymeathod;

/**
 * Hello world!
 *
 */
import java.io.*;
import java.util.*;
abstract class Area
{
	protected double area=0.0;
	abstract void getArea();
	public double display()
	{
		return area;
	}
}
class Rectangle extends Area
{
	Scanner sc1=new Scanner(System.in);
	
	public void getArea()
	{
		System.out.println("Enter Length of rectangle");
		double length=sc1.nextDouble();
		System.out.println("Enter Breadth of rectangle");
		double breadth=sc1.nextDouble();
		area=length*breadth;
	}
}
class Square extends Area
{
	Scanner sc2=new Scanner(System.in);
	public void getArea()
	{
		System.out.println("Enter side of Square");
		double side=sc2.nextDouble();
		area=side*side;
	}
}
class Factory
{
	public Area getGeometricShape(int ch)
	{
		if(ch==0)
		{
			return null;
		}
		else if(ch==1)
		{
			return new Rectangle();
		}
		else if(ch==2)
		{
			return new Square();
		}
		return null;
	}
}
public class App 
{
	 public static void main( String[] args )throws IOException
	    {
	    	int choice=0;
	    	do {
	    	Factory f=new Factory();
	    	int ch=0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Menu\n1.Rectangle\n2.Square\nEnter the index number of shape of which you want to find area\n");
	         ch=sc.nextInt();
	        String shape;
	        if(ch==1)
	        	shape="Rectangle";
	        else if(ch==2)
	        {
	        	shape="Square";
	        }
	        else
	        {
	        	shape=null;
	        }
	        Area a=f.getGeometricShape(ch);
	        a.getArea();
	        System.out.println("Area of "+ shape+" is : "+a.display());
	    System.out.println("Enter 1 to continue and 0 to exit");
	    choice=sc.nextInt();
	    	}while(choice==1);

	    }
}
