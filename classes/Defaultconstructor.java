package classes;

public class Defaultconstructor {
	int x, y;
	
	
	Defaultconstructor()
	{
		x=100;
		y=200;
	}
	
	Defaultconstructor(int a , int b)
	{
		x=a;
		y=b;
	}
	 void sum()
	 {
		 System.out.println(x+y);
	 }
	
	

	public static void main(String[] args) {
		Defaultconstructor dc = new Defaultconstructor();
		dc.sum();

	}

}
