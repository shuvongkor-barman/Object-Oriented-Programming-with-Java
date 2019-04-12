package objectorientedprogramming;

import java.util.Scanner;

public class LeastCommonMultiple {

    public void lcm() {

        int a, b, lcm;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer Number: ");
        a = input.nextInt();
        System.out.print("Enter an Integer Number: ");
        b = input.nextInt();

        lcm = (a > b) ? a : b;   // maximum number between a & b is stored in lcm

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
                break;
            }
            ++lcm;
        }
    }

}
