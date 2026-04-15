package strings;

//import java.util.Arrays;

public class palindrome {

	public static void main(String[] args) {
		String sc="Anjali";
		String palindorme="";
		
		for(int i=sc.length()-1;i>=0;i--)
		{ palindorme = palindorme + sc.charAt(i);  
		
			
			
		}if(palindorme.equals(sc))
		{
			System.out.println("word is a palindrome");
		}
		else
		{
			System.out.println("word is not a palindrome");
		}

	}

}
