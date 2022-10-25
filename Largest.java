// public Java Program to Find the Largest Among Three Numbers {

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number 1 : ");
        int number1 = input.nextInt();
        System.out.print("Enter a number 2 : ");
        int number2 = input.nextInt();
        System.out.print("Enter a number 3 : ");
        int number3 = input.nextInt();

        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("Largest number = " + number1);
            } else {
                System.out.println("Largest number = " + number3);
            }
        } else {
            if (number2 > number3) {
                System.out.println("Largest number = " + number2);
            } else {
                System.out.println("Largest number = " + number3);
            }
        }

        // int largest_number = (number1 > number2) ? (number1 > number3 ? number1 :
        // number2): (number2 > number3 ? number2 : number3);

        // System.out.println("Largest number = " + largest_number);
        input.close();
    }
}
