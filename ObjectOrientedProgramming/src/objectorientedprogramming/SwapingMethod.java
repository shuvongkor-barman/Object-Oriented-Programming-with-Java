package objectorientedprogramming;

import java.util.Scanner;

public class SwapingMethod {

    // Swaping method using a third variable
    public void swapMethod01() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int a = sc.nextInt();
        System.out.print("Enter another integer number: ");
        int b = sc.nextInt();

        System.out.println("Your Numbers before Swaping is : " + "a = " + a + ", " + "b = " + b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Your Numbers  after Swaping is : " + "a = " + a + ", " + "b = " + b);

    }

    // Swaping method without using a third variable
    public void swapMethod02() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int x = sc.nextInt();
        System.out.print("Enter another integer number: ");
        int y = sc.nextInt();

        System.out.println("Your Numbers before Swaping is : " + "x = " + x + ", " + "b = " + y);
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Your Numbers  after Swaping is : " + "a = " + x + ", " + "b = " + y);
    }

}
