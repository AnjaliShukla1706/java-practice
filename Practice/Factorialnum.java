package Practice;

import java.util.Scanner;

public class Factorialnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter the number, you want to calculate factorial for: ");
		int num= sc.nextInt();
		int fact=1;
		for(int i = 1;i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
