package Practice;

public class removespaces {

	public static void main(String[] args) {

String s = "I am here";

        String[] words = s.split(" "); 
        // split by space
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }

        System.out.println(result);

	}

}
