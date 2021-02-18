
public class Contact {
	void CreateContact(String name,long num)
	{
		System.out.println("Contact Name:"+name);
		System.out.println("Contact num:"+num);
	}
	void CreateContact(String name,long num1,long num2)
	{
		System.out.println("Name:"+name);
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
	}

	public static void main(String[] args)
	{
		Contact c1=new Contact();
		c1.CreateContact("aman",944016545);
		c1.CreateContact("Btk", 9440016545L,9030331659L);
		

	}

}
