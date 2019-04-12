package objectorientedprogramming;

import java.util.Scanner;

public class PalindromeChecker {

    public void palindromeCheckNumber() {

        int n = 0, rn = 0, originalNum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer to check if it Palindrome: ");

        n = input.nextInt();
        originalNum = n;

        while (n != 0) {
            int remainder = n % 10;
            n = n / 10;
            rn = rn * 10 + remainder;
        }
        if (originalNum == rn) {
            System.out.println(rn + " is Palindrome.");
        } else {
            System.out.println(rn + " is not Palindrome");
        }

    }

    public void palindromeCheckString() {

    }

}
