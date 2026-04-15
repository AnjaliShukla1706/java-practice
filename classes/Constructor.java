//constructor and class name must be same
//constructor never returns any value not even void but u still can mention void
//constructor is invoked as soon as u create an object
//constructors are used to initialize the variables not operations
// constructor can take parameters
// default and parameterized constructor

package classes;

public class Constructor {
	int sid;
	
	Constructor(int id)
	{
		sid=id;
	}
	void display()
	{
		System.out.println("Student id is: "+sid);
	}
	
	public static void main(String[] args) {
		Constructor cn = new Constructor(101);
		cn.display();
		

	}

}
