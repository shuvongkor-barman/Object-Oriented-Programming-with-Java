package objectorientedprogramming;

import java.util.Scanner;

public class OperationOnTwoInteger {

    public void largestNumberFinder() {

        int m, n;
        System.out.print("Enter an Integer: ");

        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        System.out.print("Enter another Integer: ");
        n = input.nextInt();

        if (m > n) {
            System.out.println("The Large Number is: " + m);
        } else if (m < n) {
            System.out.println("The Large Number is: " + n);
        }

    }
    // End of the Program

    public void evenOrOdd() {
        int s, k;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer Number: ");
        s = input.nextInt();
        System.out.print("Enter another Integer Number: ");
        k = input.nextInt();

        System.out.println(" ");
        if (s % 2 == 0) {
            System.out.println(s + " is a Even Number");
        } else {
            System.out.println(s + " is an Odd Number");
        }

        if (k % 2 == 0) {
            System.out.println(k + " is a Even Number");
        } else {
            System.out.println(k + " is an Odd Number");
        }

    }

}
