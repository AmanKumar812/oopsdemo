
public class ConstructorDemo {
int id;

ConstructorDemo() //Default constructor
{
	System.out.println("In constructor");
	id=10;
}
void display()
{
	System.out.println(id);
}
	public static void main(String[] args) {
		ConstructorDemo obj1=new ConstructorDemo(); //Defining objects so invokes constructor	
		ConstructorDemo obj2=new ConstructorDemo();
			obj1.display();	
	}

}
