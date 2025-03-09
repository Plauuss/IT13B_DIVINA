
package JavaTestingFile;

import java.util.Scanner;

public class Javatesting {

public class PalindromeChecker {

    public static void main(String[] args) { // Corrected main method signature
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive check
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
}