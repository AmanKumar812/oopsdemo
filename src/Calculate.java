
public class Calculate {
	
		void sum()
		{
			System.out.println("Method Overloading");
		}
		void sum (int a,int b)
		{
			System.out.println("sum is "+(a+b));
		}
		void sum(float a,float b)
		{
			System.out.println("sum is"+(a+b));
		}
		void sum(String a,String b)
		{
			System.out.println("Conactenation is "+(a+b));
		}
		
	public static void main(String[] args) 
	{
		Calculate cal=new Calculate();
		cal.sum();
		cal.sum(8,5);//sum(inta,intb) is called
		cal.sum(4.6f, 3.8f);//sum(floata,float b) is called
		cal.sum("Hello", "Btk");
		

	}

}
