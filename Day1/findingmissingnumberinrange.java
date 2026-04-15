package Day1;

public class findingmissingnumberinrange {

	public static void main(String[] args) {
		int a[]= {1,3,5,4};
		int sum =0;
		int miss_num=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
			
		}System.out.println(sum);
		System.out.println("missing number is : "+(15-sum));

	}

}
