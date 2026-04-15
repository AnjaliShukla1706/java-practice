package inheritenceprograms;




class E
{
	int a = 100;
	void display()
	{
		System.out.println(a);
	}
}


class F extends E
{
	int b = 200;
	void show()
	{
		System.out.println(b);
	}
}
 class C extends F
 {
	 int c = 300;
	 void print()
	 {
		 System.out.println(c);
	 }
	 
 }


public class multipleinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C bobj=new C();
		System.out.println(bobj.b);
		System.out.println(bobj.a);
		System.out.println(bobj.c);
		bobj.display();
		bobj.show();
		bobj.print();

	}

}
