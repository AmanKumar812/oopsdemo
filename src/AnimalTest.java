class Animal
{
	String name;
	public void eat()
	{
		System.out.println("I can eat");
	}
}
class Dog extends Animal// inheritance
{
	//New method in sub class
	public void display() {
		System.out.println("My name is "+name);
	}
}
public class AnimalTest {

	public static void main(String[] args) {
	// create object of sub class
		Dog labrador=new Dog();
		//Access field of super class
		labrador.name="Rohu";
		labrador.display();
		labrador.eat();

	}

}
