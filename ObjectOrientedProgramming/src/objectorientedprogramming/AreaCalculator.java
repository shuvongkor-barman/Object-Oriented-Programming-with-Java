package objectorientedprogramming;

import java.util.Scanner;

public class AreaCalculator {

    public void areaOfCircle() {
        double area, π, radius;
        π = 3.1416;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle: ");
        radius = input.nextDouble();         
        area = π * radius * radius;

        System.out.println("The Area of the Circle is : " + area);
    }

}
