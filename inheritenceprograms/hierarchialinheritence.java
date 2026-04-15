package inheritenceprograms;

class Parent
{
	void display(int a)
	{
		System.out.println(a);
		
	}
}

class child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);
		
	}
}
class child2 extends Parent
{
	void print(int c)
	{
		System.out.println(c);
		
	}
}

public class hierarchialinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 ch= new child1();
		ch.display(100);
		ch.show(900);
		
		
		child2 ch1= new child2();
		ch1.display(100);
		ch1.print(500);

	}

}
