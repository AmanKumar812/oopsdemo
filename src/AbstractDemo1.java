abstract class Shape
{
	String objectName=" ";
	Shape(String name)
	{
		this.objectName=name;
	}
	public void moveTo(int x,int y)
	{
		System.out.println(this.objectName+" "+ "has been moved to"+ "x="+x+"and y="+y);
	
	}
	// abstract methods which will be implemented by its sub classes
	abstract public double area();
	abstract public void draw();
	
}
class Rectangle1 extends Shape
{
	int length,width;
	//constructor
	Rectangle1(int length,int width,String name)
	{
		super(name);
		this.length=length;
		this.width=width;
	}
	public void draw()
	{
		System.out.println("Rectangle has been drawn");
	}
	public double area()
	{
		return(double)(length*width);
	}
}
class Circle extends Shape
{
	double pi=3.14;
	int radius;
	
	Circle(int radius,String name)
	{
		super(name);
		this.radius=radius;
	}
	public void draw()
	{
		System.out.println("Circle has been drawn");
	}
	public double area()
	{
		return(double)(pi*radius*radius);
	
	}
	
}
public class AbstractDemo1 {

	public static void main(String[] args) {
	//creating the object of rectangle class using shape class reference
		Shape rect=new Rectangle1(2,3,"Rectangle");
		rect.draw();
		System.out.println("Area of rectangle :"+rect.area());
		rect.moveTo(1, 2);
		System.out.println(" ");
		//creating the object of circle class
		Shape circle=new Circle(2,"Circle");
		circle.draw();
		System.out.println("Area of circle:"+circle.area());
		circle.moveTo(2, 4);
	}

}
