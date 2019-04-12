package objectorientedprogramming;

import java.util.Scanner;

public class QuadraticEquation {

    public void quadraticEqSolve() {

        int a, b, c;
        double root1, root2, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("The Quadratic Equation is : ax² + bx + c");

        System.out.print("Enter value of a: ");
        a = sc.nextInt();
        System.out.print("Enter value of b: ");
        b = sc.nextInt();
        System.out.print("Enter value of c: ");
        c = sc.nextInt();

        System.out.println("So the Quadratic Equation = " + a + "x² + " + b + "x + " + c);
        d = b * b - 4 * a * c;

        if (d > 0) {
            System.out.println("Roots are real and unequal");
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The fsirst root is: " + root1);
            System.out.println("The second root is: " + root2);
        } else if (d == 0) {
            System.out.println("Roots are real and equal");
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Root:" + root1);
        } else {
            System.out.println("Roots are imaginary");
        }

    }

}
