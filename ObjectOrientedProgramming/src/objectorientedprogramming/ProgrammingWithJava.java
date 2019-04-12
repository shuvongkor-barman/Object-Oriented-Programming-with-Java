package objectorientedprogramming;

import java.util.Scanner;

/**
 *
 * @author PLATEMAN
 */
public class ProgrammingWithJava {

    public static void main(String[] args) {

        System.out.println("***Menu List***");
        System.out.println("Enter 1 for : Hello World Program");
        System.out.println("Enter 2 for : Arithmetic Operation");
        
        System.out.println("Enter 10 for : Factorial Calculator");
        System.out.println("Enter 11 for : Fibonacci Series");
        System.out.println("Enter 12 for: Temperature Converter, Celsius to Farenheit");
        System.out.println("Enter 13 for: Temperature Converter, Celsius to Kelvin");
              
        System.out.println("Enter 13 for: Name And Marks Displayer");
        System.out.println("Enter 13 for: Name And Roll Displayer Using Constructor & Method");
        System.out.println("Enter 2 for : Addition Of Two Number Using Method");
        
        
        System.out.println("Enter 2 for : Swaping Method 01");
        System.out.println("Enter 3 for : Swaping Method 02");
        System.out.println("Enter 3 for : Least Common Multiple(LCM)Calculator");
        
        System.out.println("Enter 4 for : Pattern 01 Using For Loop");
        System.out.println("Enter 5 for : Pattern 02 Using For Loop");
        System.out.println("Enter 6 for : Pattern 03 Using For Loop");
        System.out.println("Enter 7 for : Pattern 04 Using For Loop");
        System.out.println("Enter 8 for : Pattern 05 Using For Loop");
        System.out.println("Enter 9 for : Pattern 06 Using For Loop");
        System.out.println("Enter 10 for : Use of Break and Continue");
        
        System.out.println("Enter 14 for : Calculating Area of Circle");
        System.out.println("Enter 14 for : Quadratic Equation Solver");

        System.out.println("Enter 15 for : Exit Program");

        System.out.print("\nEnter Your Choice: ");

        for (;;) {

            Scanner sc = new Scanner(System.in);
            int cn = sc.nextInt();

            switch (cn) {

                case 1:
                    System.out.println("\n***Hello World Printer***");
                    HelloWorld obj = new HelloWorld();
                    obj.helloWorldPrinter();
                    break;

                case 2:
                    System.out.println("\n***Arithmetic Operation***");
                    ArithmeticOperation obj01 = new ArithmeticOperation();
                    obj01.arithmatic();
                    break;
                case 3:
                    System.out.println("\n***Arithmetic Operation***");
                    AdditionOfTwoNumberUsingMethod obj02 = new AdditionOfTwoNumberUsingMethod();
                    obj02.AdditonOfTwoNumber();
                    break;

                case 4:
                    System.out.println("\n***Swaping Method 01***");
                    SwapingMethod obj03 = new SwapingMethod();
                    obj03.swapMethod01();
                    break;
                case 5:
                    System.out.println("\n***Swaping Method 02***");
                    SwapingMethod obj3 = new SwapingMethod();
                    obj3.swapMethod02();
                    break;
                case 6:
                    System.out.println("\n***Pattern 01 Using For Loop***");
                    PatternBuilder obj4 = new PatternBuilder();
                    obj4.patternBuilder01();
                    break;

                case 7:
                    System.out.println("\n***Pattern 02 Using For Loop***");
                    PatternBuilder obj5 = new PatternBuilder();
                    obj5.patternBuilder02();
                    break;

                case 8:
                    System.out.println("\n***Pattern 03 Using For Loop***");
                    PatternBuilder obj6 = new PatternBuilder();
                    obj6.patternBuilder03();
                    break;

                case 9:
                    System.out.println("\n***Pattern 04 Using For Loop***");
                    PatternBuilder obj7 = new PatternBuilder();
                    obj7.patternBuilder04();
                    break;

                case 10:
                    System.out.println("\n***Pattern 05 Using For Loop***");
                    PatternBuilder obj8 = new PatternBuilder();
                    obj8.patternBuilder05();
                    break;

                case 11:
                    System.out.println("\n***Pattern 06 Using For Loop***");
                    PatternBuilder obj9 = new PatternBuilder();
                    obj9.patternBuilder06();
                    break;

                case 12:
                    System.out.println("\n***Pattern 06 Using For Loop***");
                    BreakAndContinue obj07 = new BreakAndContinue();
                    obj07.breakContinue();
                    break;

                case 13:
                    System.out.println("\n***Factorial Calculator***");
                    FactorialCalculator obj10 = new FactorialCalculator();
                    obj10.factorial();
                    break;

                case 15:
                    System.out.println("\n***Fibonacci Series Generator***");
                    FibonacciSeries obj11 = new FibonacciSeries();
                    obj11.fibonacciSeriesGenerator();
                    break;

                case 16:
                    System.out.println("\n***Temperature Converter, Celsius to Farenheit***");
                    TemperatureConverter obj12 = new TemperatureConverter();
                    obj12.celsiusToFarenheit();
                    break;

                case 17:
                    System.out.println("\n***Temperature Converter, Celsius to Kelvin***");
                    TemperatureConverter obj13 = new TemperatureConverter();
                    obj13.celsiusToKelvin();
                    break;

                case 18:
                    System.out.println("\n***Area Calculator for Cicle***");
                    AreaCalculator obj14 = new AreaCalculator();
                    obj14.areaOfCircle();
                    break;

                case 19:
                    System.out.println("\n***Palindrome Checker***");
                    PalindromeChecker obj15 = new PalindromeChecker();
                    obj15.palindromeCheckNumber();
                    break;

                case 20:
                    System.out.println("\n***Quadratic Equation Solver***");
                    QuadraticEquation obj20 = new QuadraticEquation();
                    obj20.quadraticEqSolve();
                    break;

                case 25:
                    System.out.println("\nProgram Closed");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invaild Choice");
                    System.out.println("Please enter a valid choice");

            }

            System.out.println("\n ");
            System.out.println("***Menu List***");
            System.out.println("Enter 1 for : Searching Method");
            System.out.println("Enter 2 for : Sorting Method");
            System.out.println("Enter 3 for : Exit Program");
        }

    }
}
