package classes;

public class emoloyeeclass {
	int eid;
	String name;
	String job;
	int sal;
	
	
	void display()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emoloyeeclass ec = new emoloyeeclass();
		ec.eid=100;
		ec.name="Anvika";
		ec.job="Doctor";
		ec.sal=10000000;
		System.out.println("my name is: "+ec.name);
		ec.display();
		
		emoloyeeclass ec1 = new emoloyeeclass();
		ec1.eid=101;
		ec1.name="Anvik";
		ec1.job="Doctor";
		ec1.sal=20000000;
		ec1.display();
		

	}

}
