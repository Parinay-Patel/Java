// Java Program to Swap Two Numbers

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number 1 : ");
        int number1 = input.nextInt();
        System.out.print("Enter a Number 2 : ");
        int number2 = input.nextInt();

        // int number3 = number1;
        // number1 = number2;
        // number2 = number3;

        // int number3 = number1 + number2;
        // number1 = number3 - number1;
        // number2 = number3 - number2;

        number1 -= number2;
        number2 = number1 + number2;
        number1 = number2 - number1;
        System.out.println("Number 1 : " + number1);
        System.out.print("Number 2 : " + number2);
        input.close();
    }
}
