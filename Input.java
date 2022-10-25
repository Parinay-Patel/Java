//Java Program to Print an Integer (Entered by the User)

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = input.nextInt();
        System.out.println("Entered number = " + number);
        input.close();
    }
}
