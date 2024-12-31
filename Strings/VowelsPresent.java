package String;

import java.util.Scanner;

public class VowelsPresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert the input to lowercase for case-insensitive comparison
        scanner.close();

        boolean hasAllVowels = checkAllVowels(input);

        if (hasAllVowels) {
            System.out.println("The string contains all vowels.");
        } else {
            System.out.println("The string does not contain all vowels.");
        }
    }

    private static boolean checkAllVowels(String input) {
        return input.contains("a") && input.contains("e") && input.contains("i") && input.contains("o") && input.contains("u");
    }
}

