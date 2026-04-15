package inheritenceprograms;


class A
{
	int a = 100;
	void display()
	{
		System.out.println(a);
	}
}


class B extends A
{
	int b = 200;
	void show()
	{
		System.out.println(b);
	}
}
public class singleinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B bobj=new B();
		System.out.println(bobj.b);
		System.out.println(bobj.a);
		bobj.display();
		bobj.show();

	}

}
