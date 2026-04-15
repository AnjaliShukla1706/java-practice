package Practice;

import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double si;
		System.out.println("enter principle");
		int p=sc.nextInt();
		System.out.println("enter rate");
		double r=sc.nextDouble();
		System.out.println("enter time");
		int t=sc.nextInt();
		si=(p*r*t)/100;
		System.out.println("here's the calculated simple interest: "+si);
		sc.close();
		
		

	}

}
