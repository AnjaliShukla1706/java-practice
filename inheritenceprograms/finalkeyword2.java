package inheritenceprograms;
final class test1
{
	final void m()
	{
		System.out.println("Iam M from test 1 class");
	}
}
class test2 extends test1
{
	void m()
	{
		System.out.println("Iam M from test 2 class");
	}
}
public class finalkeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//final methods cant be overrided in any other child class
//final class cant be extended to any other child class
