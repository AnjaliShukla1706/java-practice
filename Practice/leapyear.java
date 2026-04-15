package Practice;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
		{
			System.out.println("tuhein yatna nai pta?  leap year huwe "+year);
		}
		else
		{
			System.out.println("arey non leap year huwe yaar kau kahi tunhka");
		}
				
			sc.close();
		

	}

}
