package objectorientedprogramming;

import java.util.Scanner;

public class FibonacciSeries {

    public void fibonacciSeriesGenerator() {
        int m, t1 = 0, t2 = 1;
        System.out.print("Enter the Number of Terms: ");

        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        System.out.println("The Fibonacci Series of " + m + " terms is: ");

        for (int i = 1; i <= m; ++i) {
            System.out.print(t1 + " , ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

}
