package objectorientedprogramming;

import java.util.Scanner;

public class AdditionOfTwoNumberUsingMethod {

    int sumMethod(int a, int b) {

        int sum = a + b;

        return sum;
    }

    public void AdditonOfTwoNumber() {

        int m, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer Number: ");
        m = input.nextInt();

        System.out.print("Enter another Integer Number: ");
        n = input.nextInt();

        AdditionOfTwoNumberUsingMethod sum01 = new AdditionOfTwoNumberUsingMethod();
        int result = sum01.sumMethod(m, n);

        System.out.println("The Addition of " + m + " + " + n + " is = " + result);
    }

}
