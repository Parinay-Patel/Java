// Java Program to Check Whether a Number is Even or Odd

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number which you want to check Even or Odd : ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.print(number + " is Even.");
        } else {
            System.out.print(number + " is Odd.");
        }
        input.close();
    }
}
