package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class readingandwritingfromarray {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Please enter a value for position "+i);
			a[i]=sc.nextInt();
		}System.out.println("Here, are the values you entered "+Arrays.toString(a));

	}

}
