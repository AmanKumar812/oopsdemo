
public class Emp {
int id;
String name;
Address address;//Aggregation
public Emp(int id,String name,Address address)
{
	this.id=id;
	this.name=name;
	this.address=address;
}
void display()
{
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
	
}
	public static void main(String[] args) {
	Address address1=new Address("Bangalore","Karnataka","India");
	Address address2=new Address("Hyderabad","Telangana","India");
	
	Emp e1=new Emp(111,"Aman",address1);
	Emp e2=new Emp(112,"Btk",address2);
	e1.display();
	e2.display();

	}

}
