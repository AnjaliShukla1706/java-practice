package Practice;

public class count_vowels_consonants {

	public static void main(String[] args) {
		String input = "Hello, Anjali! QE 123";
        countVowelsAndConsonants(input);
    }

    static void countVowelsAndConsonants(String s) {
        int vowels = 0, consonants = 0;

        // 1) Normalize to lower-case so 'A' and 'a' are treated the same
        s = s.toLowerCase();

        // 2) Go through each character
        for (char ch : s.toCharArray()) {

            // 3) Consider only letters a..z
            if (ch >= 'a' && ch <= 'z') {

                // 4) If vowel, increase vowels; else it's a consonant
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            // Any other character (space, digits, punctuation) is ignored here
        }

        System.out.println("Input: " + s);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Helper that returns true for vowels
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

	}

