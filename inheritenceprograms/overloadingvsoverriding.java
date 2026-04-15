package inheritenceprograms;
class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}
class XYZ extends ABC
{
	void m1(int a)
	{
		System.out.println(a*a);//overriding
	}
	void m2(int a, int b)
	{
		System.out.println(a+b);//overloading
	}
}


public class overloadingvsoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ xyz= new XYZ();
		ABC abc= new ABC();
		abc.m1(10);
		xyz.m1(10);
		xyz.m2(20);
		xyz.m2(19,89);

	}

}
