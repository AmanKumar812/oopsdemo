
public class PersonTest {

	public static void main(String[] args) {
		Person objPerson=new Person();// invoke default constructor
		
		Person objPerson1=new Person("Aman",22); // parameterized constructor
		Person objPerson2=new Person("Btk",32,"pochinki");
		
		objPerson.input();
		objPerson.print();
		objPerson1.print();
		objPerson2.print();

	}

}
