package Practice;

public class count_vow_cons {

	public static void main(String[] args) {
		String s = "Shaka Laka Boom B0om!!!11";
		s=s.toLowerCase();
		char[] arr=s.toCharArray();
		int vowels=0, consonants=0, spaces=0, digits=0, extras=0;
		for( char c: arr)
		{
			if(c>='a' && c<='z')
			{
			switch (c)
			{
				case 'a': case 'e':case 'i':case 'o':case 'u':
					vowels++;
					break;
				default:
					consonants++;
			}
			}
			else if (c == ' ')
			{
				spaces++;
			}
			else if(c>='0' && c<='9')
			{
				digits++;
			}
			else
			{
				extras++;
			}
		}
		System.out.println("Vowels in the String s: "+vowels);
		System.out.println("Consonants in the String s: "+consonants);
		System.out.println("digits in the String s: "+digits);
		System.out.println("Spaces in the String s: "+spaces);
		System.out.println("extras in the String s: "+extras);
		System.out.println(s.length());


	}

}
