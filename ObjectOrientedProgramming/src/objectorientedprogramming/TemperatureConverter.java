package objectorientedprogramming;

import java.util.Scanner;

public class TemperatureConverter {

    /* Java Program for converting Celsius to Fahrenheit Temperature */
    public void celsiusToFarenheit() {

        double celsius, farenheit = 0;
        System.out.print("Enter a Temperature in Celsius: ");

        Scanner sc = new Scanner(System.in);

        celsius = sc.nextInt();
        System.out.println("Your Entered Temperature is : " + celsius + "° C");

        farenheit = 9 * celsius / 5 + 32;  //formula to convert celsius to farenheit

        System.out.println("The Fahrenheit Temperature is = " + farenheit + "° F");
    }

    public void celsiusToKelvin() {

        double celsius, kelvin = 0;
        System.out.print("Enter a Temperature in Celsius: ");

        Scanner sc = new Scanner(System.in);

        celsius = sc.nextInt();
        System.out.println("Your Entered Temperature is : " + celsius + "° C");

        kelvin = celsius + 273.15; //formula to convert celsius to farenheit

        System.out.println("The Kelvin Temperature is = " + kelvin + "° F");
    }

}
