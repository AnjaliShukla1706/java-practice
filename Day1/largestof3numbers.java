package Day1;

import java.util.Scanner;

public class largestof3numbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a");
		int a = sc.nextInt();
		Scanner sc2= new Scanner(System.in);
		System.out.println("enter a");
		int b = sc.nextInt();
		Scanner sc1= new Scanner(System.in);
		System.out.println("enter a");
		int c = sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is largest");
		}
		else if(c>b && a<c)
		{
			System.out.println("c is largest");
		}
		else
		{
			System.out.println("b is largest");
		}
		}
		
		

	}


