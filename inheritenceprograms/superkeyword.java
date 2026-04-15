package inheritenceprograms;
class Animal
{
	String color="blue";
	void eat()
	{
		System.out.println("eato");
	}
}
class dog extends Animal
{
	String color="White";
	void display()
	{
		System.out.println(super.color);
	}
	void eat()
	{
		System.out.println("kya eatun ??");
		super.eat();
	}
}

public class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog();
		//d.color="yellow";
		d.display();
		d.eat();

	}

}
