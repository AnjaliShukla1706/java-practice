package reversenumber;

import java.util.Arrays;

public class reverseanarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int rev_num= 0;
		for(int i=a.length-1;i>=0;i--)
		{
			rev_num=a[i];
			a[i]=rev_num;
			System.out.println("Here, you get your reverse numbers: "+rev_num);
		}System.out.println(Arrays.toString(a));

	}

}
