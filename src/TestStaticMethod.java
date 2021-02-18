class Student200
{
	private int rollno;
	private String name;
	static String college="GNI";
	public static void changeCollege()
	{
		college="GNU";
		
	}
	public Student200(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

}

public class TestStaticMethod {

	public static void main(String[] args) {
		Student200.changeCollege();//call staticmethod without object
		Student200 s1=new Student200(101,"Aman");
		Student200 s2=new Student200(102,"BTK");
		Student200 s3=new Student200(103,"edge");
		
		s1.display();
		s2.display();
		s3.display();
		

	}

}
