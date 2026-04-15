// block or group of statement which will perform certain tasks. we have to call the method through object.

// no param no return 
// no param retirn val
// take param no return
//take param return val

package classes;

public class methods {
	
	void m1()
	{
		System.out.println("hello");
	}
	
	String m2()
	{
		return("World");
	}
	
	void m3(String name)
	{
		System.out.println("Hello "+name);
	}
	
	String m4(String name)
	{
		return name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methods m=new methods();
		m.m1();
		String a = m.m2();
		System.out.println(a);
		m.m3("Anjali");
		String name = m.m4("John");
		System.out.println(name);

	}

}
