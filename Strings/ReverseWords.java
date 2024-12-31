package String;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    private static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+"); // Split the sentence into words using whitespace as delimiter
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        return reversedSentence.toString().trim(); // Trim to remove the trailing space
    }
}
