package Practice;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev=0;
        
        while(n!=0)
        {
        int num;
        num=n%10;
        rev = rev*10 + num;
        n = n/10;
        }
        System.out.println(rev);
        
        
        
        
        sc.close();

	}

}
