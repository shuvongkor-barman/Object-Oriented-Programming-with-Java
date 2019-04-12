package objectorientedprogramming;

public class PatternBuilder {

    public void patternBuilder01() {

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("0 ");
            }
            System.out.println(" ");
        }
    }

    public void patternBuilder02() {

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("0 ");
            }
            System.out.println(" ");
        }
    }

    public void patternBuilder03() {

        for (int i = 3; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("0 ");
            }
            System.out.println(" ");
        }
    }

    public void patternBuilder04() {

        for (int i = 3; i <= 0; i++) {
            for (int j = i; j <= 0; j++) {
                System.out.print("0 ");
            }
            System.out.println("* ");
        }
    }

    public void patternBuilder05() {

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(" ");

        }
    }

    public void patternBuilder06() {

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");

        }

    }

}
