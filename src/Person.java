import java.util.Scanner;
public class Person {
	private String name;
    private int age;
    private String constituency;
    Scanner s;
    Person() // Default constructor
    {
    System.out.println("voter eligibility app");
    age=0;
    name="";
    constituency="Bengaluru";
    s=new Scanner(System.in);
    }
    Person(String n,int a) //Parameterized constructor
    {
    	name=n;
    	age=a;
    }
    Person(String n,int a,String c) // parameterized constructor
    {
     name=n;
     age=a;
     constituency=c;
    
  }
    public void input() {
        System.out.println("Enter Your Name:");
       name=s.next();
       System.out.println("Enter Your age:");
        age=s.nextInt();
       }
    public void print()
    {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Constituency is: " + constituency);
        }
    
}
