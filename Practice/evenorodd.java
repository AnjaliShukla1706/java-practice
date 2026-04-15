package Practice;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("number is even number");
		}
		
		else
		{
			System.out.println("Odd hai baba!");
		}
		sc.close();
		

	}

}
