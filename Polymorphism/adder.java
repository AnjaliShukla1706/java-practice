package Polymorphism;

public class adder {
	
	
	int a=10, b=20;
	
	void sum()
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y)
	{
		System.out.println(x+y);
	}
	
	void sum(double y, int x)
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		adder ad = new adder();
		ad.sum();
		ad.sum(10,100);
		ad.sum(10,10.15);
		ad.sum(10.90,10);

	}

}
