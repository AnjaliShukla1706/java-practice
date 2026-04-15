package Encapsulation;

public class thiskeyword {
	int x,y;
	
	thiskeyword(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		
		thiskeyword tk= new thiskeyword(20,30);
		tk.display();
		
	}

}
// this keyword is used to access the class variables in a method 
// When constructor or method parameters have the same name as fields, this points to the field.
// we can't create global variables in Java
// static method(main method) can access static variables and static methods w/o creating object