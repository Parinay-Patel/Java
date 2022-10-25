// Java Program to Find all Roots of a Quadratic Equation

import java.util.Scanner;
import static java.lang.Math.*;

public class Quadratic {
    static void Roots(int a, int b, int c) {
        if (a == 0) {
            System.out.println("The value of a cannot be 0.");
            return;
        }
        int d = b * b - 4 * a * c;
        double D = sqrt(abs(d));
        if (d > 0) {
            System.out.println("The roots of the equation are real and different. \n");
            System.out.println("Root 1 : " + (double) (-b + D) / (2 * a));
            System.out.println("Root 2 : " + (double) (-b - D) / (2 * a));
        } else if (d == 0) {
            System.out.println("The roots of the equation are real and same. \n");
            System.out.println("Root 1 : " + -(double) b / (2 * a));
            System.out.println("Root 2 : " + -(double) b / (2 * a));
        } else {
            System.out.println("The roots of the equation are complex and different. \n");
            System.out.println("Root 1 : " + -(double) b / (2 * a) + " + i" + D);
            System.out.println("Root 2 : " + -(double) b / (2 * a) + " - i" + D);
        }
    }

    public static void main(String args[]) {
        System.out.println("Quadratic Equation is ax^2 + bx + sc = 0");
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        a = input.nextInt();
        System.out.print("Enter value of b : ");
        b = input.nextInt();
        System.out.print("Enter value of c : ");
        c = input.nextInt();
        Roots(a, b, c);
        input.close();
    }
}
