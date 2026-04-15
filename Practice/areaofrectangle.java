package Practice;

import java.util.Scanner;

public class areaofrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double areaofrec;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter length");
		double len = sc.nextDouble();
		System.out.println("Enter width");
		
		System.out.println("Enter height");
		double height= sc.nextDouble();
		areaofrec=0.5*len*height;
		
		System.out.print("here I have calculated area of rectangle for you: "+areaofrec);
		sc.close();
		
		
		

	}

}
