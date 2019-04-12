package objectorientedprogramming;

import java.util.Scanner;

public class ArithmeticOperation {

    public void arithmatic() {

        int m, n, sum, sub, mul, div;
        System.out.print("Enter an integer number: ");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        System.out.print("Enter another integer number: ");
        n = sc.nextInt();

        sum = m + n;  // For Addition
        sub = m - n;  // For Substracton
        mul = m * n;  // For Multiplication
        div = m / n;    // For Division

        System.out.println("The Addition of " + m + " + " + n + " = " + sum);
        System.out.println("The Substraction of " + m + " - " + n + " = " + sub);
        System.out.println("The Multiplication of " + m + " × " + n + " = " + mul);
        System.out.println("The Division of " + m + " ÷ " + n + " = " + div);

    }

}
