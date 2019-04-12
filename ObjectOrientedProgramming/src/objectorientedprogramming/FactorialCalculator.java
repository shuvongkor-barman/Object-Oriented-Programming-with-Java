package objectorientedprogramming;

import java.util.Scanner;

public class FactorialCalculator {

    /* Method to Calculate Factorial */
    public void factorial() {

        int m, n, fact = 1;
        System.out.print("Enter an Integer to Calculate it's Factorial: ");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();

        if (m < 0) {
            System.out.println("Number should be non-negative.");
        } else {
            for (n = 1; n <= m; n++) {
                fact = fact * n;
            }

            System.out.println("The Factorial of " + m + " is = " + fact);
        }
    }

}
