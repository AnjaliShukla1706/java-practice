package Practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter the number, you want to test for prime number: ");
		int num= sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count=count+1;
			}
			
		}
		
		if(num<0)
		{
			System.out.println("we don't calculate for negative numbers");
		}
		else if(count==0)
		{
			System.out.println("Number is NOT a Prime number");
		}
		else
		{
			System.out.println("Number is a Prime number");
		}
		sc.close();

	}

}
