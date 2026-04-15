package staticclasses;

public class staticdemo {
	
	static int a = 10;
	int b = 20;
	
	static void m1()
	{
		System.out.println("I am static method");
	}
	
	void m2()
	{
		System.out.println("I am non static method");
		System.out.println(a);
		m1();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(a);
		m1();*/
		
		staticdemo sd = new staticdemo();
		System.out.println(sd.b);
		sd.m2();
		
		

	}

}
