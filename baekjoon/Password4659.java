package baekjoon;

import java.util.Scanner;

public class Password4659 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String password = scanner.nextLine();

            if (password.equals("end")) {
                break;
            }

            evaluatePassword(password);
        }

        scanner.close();
    }

    public static void evaluatePassword(String password) {
        boolean hasVowel = false;
        boolean hasConsecutiveVowelsOrConsonants = false;
        boolean hasConsecutiveRepeatedLetters = false;

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int consecutiveCount = 1;

        char prevChar = password.charAt(0);

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);

            if (isVowel(currentChar)) {
                hasVowel = true;
            }

            if (currentChar == prevChar) {
                consecutiveCount++;
                if (consecutiveCount >= 3 && currentChar != 'e' && currentChar != 'o') {
                    hasConsecutiveRepeatedLetters = true;
                }
            } else {
                consecutiveCount = 1;
            }

            if (i > 0) {
                char prevPrevChar = password.charAt(i - 1);
                if ((isVowel(prevPrevChar) && isVowel(prevChar) && isVowel(currentChar)) ||
                        (!isVowel(prevPrevChar) && !isVowel(prevChar) && !isVowel(currentChar))) {
                    hasConsecutiveVowelsOrConsonants = true;
                }
            }

            prevChar = currentChar;
        }

        if (hasVowel && !hasConsecutiveVowelsOrConsonants && !hasConsecutiveRepeatedLetters) {
            System.out.println("<" + password + "> is acceptable.");
        } else {
            System.out.println("<" + password + "> is not acceptable.");
        }
    }
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
