import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
	Stack<String> s =new Stack<String>();
	
	s.push("Java");
	s.push("C++");
	s.push("C#");
	s.push("Python");
	
	System.out.println(s);
	
	s.pop();
	
	Iterator<String> itr=s.iterator();
    while(itr.hasNext()){
    System.out.println(itr.next());
    
    }
    System.out.println("peek:"+s.peek());
    
	
	

	}

}
