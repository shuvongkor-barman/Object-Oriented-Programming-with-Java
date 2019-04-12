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
        System.out.println("Enter 3 for : Addition Of Two Number Using Method");
        
        System.out.println("Enter 4 for : Even or Odd Finder");
        System.out.println("Enter 5 for : Largest Number Finder");
        System.out.println("Enter 6 for: Name And Marks Displayer");
        System.out.println("Enter 7 for: Name And Roll Displayer Using Constructor & Method");

        System.out.println("Enter 8 for : Swaping Method 01");
        System.out.println("Enter 9 for : Swaping Method 02");

        System.out.println("Enter 10 for : Pattern 01 Using For Loop");
        System.out.println("Enter 11 for : Pattern 02 Using For Loop");
        System.out.println("Enter 12 for : Pattern 03 Using For Loop");
        System.out.println("Enter 13 for : Pattern 04 Using For Loop");
        System.out.println("Enter 14 for : Pattern 05 Using For Loop");
        System.out.println("Enter 15 for : Pattern 06 Using For Loop");

        System.out.println("Enter 16 for : Use of Break and Continue");

        System.out.println("Enter 17 for : Factorial Calculator");
        System.out.println("Enter 18 for : Fibonacci Series");
        System.out.println("Enter 19 for: Temperature Converter, Celsius to Farenheit");
        System.out.println("Enter 20 for: Temperature Converter, Celsius to Kelvin");
        System.out.println("Enter 21 for : Calculating Area of Circle");

        System.out.println("Enter 22 for : Palindrome Checker");
        System.out.println("Enter 23 for : Quadratic Equation Solver");

        System.out.println("Enter 24 for : Least Common Multiple(LCM)Calculator");


        System.out.println("Enter 25 for : Exit Program");

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
                    System.out.println("\n***Addition of Two Number using a method***");
                    AdditionOfTwoNumberUsingMethod obj02 = new AdditionOfTwoNumberUsingMethod();
                    obj02.AdditonOfTwoNumber();
                    break;

                case 4:
                    System.out.println("\n***Even or Odd Finder ***");
                    OperationOnTwoInteger obj17 = new OperationOnTwoInteger();
                    obj17.evenOrOdd();
                    break;

                case 5:
                    System.out.println("\n***Largest Number Finder ***");
                    OperationOnTwoInteger obj18 = new OperationOnTwoInteger();
                    obj18.largestNumberFinder();
                    break;

                case 6:
                    System.out.println("\n***Name and Mark Displayer***");
                    NameMarksDisplayer obj16 = new NameMarksDisplayer();
                    obj16.DIU();
                    break;

                case 7:
                    System.out.println("\n***Name and Roll Displayer***"); 
                    NameRollDisplayer obj19 = new NameRollDisplayer();
                    obj19.NameAndRoll();
                    break;

                case 8:
                    System.out.println("\n***Swaping Method 01***");
                    SwapingMethod obj03 = new SwapingMethod();
                    obj03.swapMethod01();
                    break;
                case 9:
                    System.out.println("\n***Swaping Method 02***");
                    SwapingMethod obj3 = new SwapingMethod();
                    obj3.swapMethod02();
                    break;
                case 10:
                    System.out.println("\n***Pattern 01 Using For Loop***");
                    PatternBuilder obj4 = new PatternBuilder();
                    obj4.patternBuilder01();
                    break;

                case 11:
                    System.out.println("\n***Pattern 02 Using For Loop***");
                    PatternBuilder obj5 = new PatternBuilder();
                    obj5.patternBuilder02();
                    break;

                case 12:
                    System.out.println("\n***Pattern 03 Using For Loop***");
                    PatternBuilder obj6 = new PatternBuilder();
                    obj6.patternBuilder03();
                    break;

                case 13:
                    System.out.println("\n***Pattern 04 Using For Loop***");
                    PatternBuilder obj7 = new PatternBuilder();
                    obj7.patternBuilder04();
                    break;

                case 14:
                    System.out.println("\n***Pattern 05 Using For Loop***");
                    PatternBuilder obj8 = new PatternBuilder();
                    obj8.patternBuilder05();
                    break;

                case 15:
                    System.out.println("\n***Pattern 06 Using For Loop***");
                    PatternBuilder obj9 = new PatternBuilder();
                    obj9.patternBuilder06();
                    break;

                case 16:
                    System.out.println("\n***Break and Continue***");
                    BreakAndContinue obj07 = new BreakAndContinue();
                    obj07.breakContinue();
                    break;

                case 17:
                    System.out.println("\n***Factorial Calculator***");
                    FactorialCalculator obj10 = new FactorialCalculator();
                    obj10.factorial();
                    break;

                case 18:
                    System.out.println("\n***Fibonacci Series Generator***");
                    FibonacciSeries obj11 = new FibonacciSeries();
                    obj11.fibonacciSeriesGenerator();
                    break;

                case 19:
                    System.out.println("\n***Temperature Converter, Celsius to Farenheit***");
                    TemperatureConverter obj12 = new TemperatureConverter();
                    obj12.celsiusToFarenheit();
                    break;

                case 20:
                    System.out.println("\n***Temperature Converter, Celsius to Kelvin***");
                    TemperatureConverter obj13 = new TemperatureConverter();
                    obj13.celsiusToKelvin();
                    break;

                case 21:
                    System.out.println("\n***Area Calculator for Cicle***");
                    AreaCalculator obj14 = new AreaCalculator();
                    obj14.areaOfCircle();
                    break;

                case 22:
                    System.out.println("\n***Palindrome Checker***");
                    PalindromeChecker obj15 = new PalindromeChecker();
                    obj15.palindromeCheckNumber();
                    break;

                case 23:
                    System.out.println("\n***Quadratic Equation Solver***");
                    QuadraticEquation obj20 = new QuadraticEquation();
                    obj20.quadraticEqSolve();
                    break;

            case 24:
                    System.out.println("\n*** Least Common Multiple(LCM)Calculator ***");
                    LeastCommonMultiple obj21 = new LeastCommonMultiple();
                    obj21.lcm();
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
            System.out.println("***Enter Your Choice: ***");

        }

    }
}
