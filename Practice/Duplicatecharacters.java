package Practice;

public class Duplicatecharacters {

	public static void main(String[] args) {

String s = "AnJaLi";
        s = s.toLowerCase();   // optional, to ignore case

        int[] freq = new int[256];  // ASCII size

        // count frequency of each character
        for (char c : s.toCharArray()) {
            if (c != ' ') {           // ignore spaces
                freq[c]++;
            }
        }

        System.out.println("Duplicate characters:");

        // print characters that appear more than once
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char)i + " → " + freq[i] + " times");
            }
        }


	}

}
