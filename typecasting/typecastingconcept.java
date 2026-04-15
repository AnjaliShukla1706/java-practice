package typecasting;
//parent class ref variable can store properties of child value eg., parent p = new child();--upcasting
public class typecastingconcept {

	public static void main(String[] args) {
		/*int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		float floatvalue=10.5F;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);*/
		
		long longval= 10000;
		int intval=(int) longval;
		System.out.println(intval);
		
		double doubleval=156.8;
		float floatval=(float) doubleval;
		System.out.println(floatval);
		
		//Example of upcasting
		int i = 100;
		double d =  i;
		System.out.println(d);
		
		//Example of downcasting
		double doublval = 100.98;
		int ival= (int) doublval;
		System.out.println(ival);
	}

}
