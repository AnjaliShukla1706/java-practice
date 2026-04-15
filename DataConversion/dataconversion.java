package DataConversion;

public class dataconversion {

	public static void main(String[] args) {
		String s1="100";
		String s2="300";
		System.out.println(Integer.parseInt(s2)+Integer.parseInt(s1));
		
		//Double--Double.parsedouble(s)
		//boolean--Boolean.parseBoolean(s)--however it is string so it will return false except true
		String s = "true";
		System.out.println(Boolean.parseBoolean(s));
		String s3 = "Java";
		System.out.println(Boolean.parseBoolean(s3));
		
		
		//int,double,boolean,char--string
		char ch = 'A';
		int x = 100;
		Boolean bool = false;
		double y = 20.5;
		String s4 = String.valueOf(ch);
		System.out.println((s4));
		s4 = String.valueOf(x);
		System.out.println((s4));
		s4 = String.valueOf(bool);
		System.out.println((bool));
		s4 = String.valueOf(y);
		System.out.println(y);
				
				
		
		
		
		
		

	}

}
