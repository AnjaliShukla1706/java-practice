package Day1;

import java.util.Scanner;

public class swapitwonumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number a: ");
		int a= sc.nextInt();
		System.out.println("enter the number b: ");
		int b= sc.nextInt();

		 a = a + b;  // sum
		        b = a - b;  // (a + b) - b = a
		        a = a - b;  // (a + b) - a = b

		System.out.println(a);
		System.out.println(b);

	}

}
