package objectorientedprogramming;

public class BreakAndContinue {

    public void breakContinue() {
        // Use of Break
        System.out.println("Use of Break");
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {

                break;
            } else {
                System.out.print(i + ",");
            }
        }

        // Use of Continue
        System.out.println("");
        System.out.println("Use of Continue");
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {

                continue;
            } else {
                System.out.print(i + ", ");
            }
        }
    }

}
