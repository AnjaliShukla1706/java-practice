package typecasting;

//child class object we can always store in a parent class object eg, parent p = new child();
class Parent
{
	int i = 100;
	void m1()
	{
		System.out.println("This is parent class");		
}
}
class Child extends Parent
{
	int m = 100;
	void m2()
	{
		System.out.println("This is child class");		
}
}

public class typecastingobjects {
	
	
	

	public static void main(String[] args) {
		/*Child ch = new Child();
		ch.m2();
		System.out.println(ch.m);
		ch.m1();
		System.out.println(ch.i);*/
		
		
		/*Parent p = new Child();//upcasting
		p.m1();
		//p.m2();//parent class ref variable can't access child class methods
		System.out.println(p.i);
		//System.out.println(p.m);//parent class ref variable can't access child class methods*/
		
		Parent p = new Parent();
		Child c = (Child)p;//downcasting
		System.out.println(c.i);
		System.out.println(c.m);
		c.m1();
		c.m2();
		
	}

}

// Rule 1: cat ct = (cat) an-- A B C D
//1: Type of d and c must have some relationship
//2. c must be wither sameor child of a
//3. underlying object of d must be either same or child of c

