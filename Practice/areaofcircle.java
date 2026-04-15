package Practice;

import java.util.Scanner;

public class areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double areaofcircle;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle");
		Double radius=sc.nextDouble();
		areaofcircle=3.14*radius*radius;
		System.out.println("here you get the area of circle: "+areaofcircle);
		

	}

}
