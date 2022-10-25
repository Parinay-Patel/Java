// Java Program to Check Whether an Alphabet is Vowel or Consonant

import java.util.Scanner;

public class Vowel_or_Consonent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char character = input.next().charAt(0);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
                || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.print(character + " Vowel.");
        } else {
            System.out.print(character + " is Consonent.");
        }
        input.close();
    }
}
