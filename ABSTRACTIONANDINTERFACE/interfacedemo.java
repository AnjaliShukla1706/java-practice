// so these interface classes create static and final variables and ( default and static methods)
// if we don't specify any access modifier, default access modifier is allocated to method in the class
package ABSTRACTIONANDINTERFACE;

interface Shape
{
	int length=10;// static and final variables created
	int width=20;
	
	
	
	void circleradius();
	
	default void square()
	{
		System.out.println("hey I am a default method");
	}
	
	static void rectangle()
	{
		System.out.println("hey I am a static method");
	}
}

public class interfacedemo implements Shape{
	
	public void circleradius()
	{
		System.out.println("hey I am the abstract method which is implemented here");
	}

	public static void main(String[] args) {
		
		interfacedemo id=new interfacedemo();
		//Shape sh=new interfacedemo();
		id.circleradius();
		id.square();
		Shape.rectangle();
		System.out.println(Shape.length*Shape.width);
	}

}
