package strings;

public class countoccurancesofcharacter {

	public static void main(String[] args) {
		String s="aaabbcc";
		int count = 0,count1=0,count2=0;
		for (int i=0;i<s.length();i++)
		{//int count = 0,count1=0,count2=0;
			char b=s.charAt(i);
			if(b==s.charAt(i))
			{
				count=count+1;
			}
			else if(b==s.charAt(i))
			{
				count1=count1+1;
			}
			else
			{
				count2=count2+1;
			}
		}System.out.println("the count of a is: "+count);
		System.out.println("the count of b is: "+count1);
		System.out.println("the count of c is: "+count2);
	}

}
