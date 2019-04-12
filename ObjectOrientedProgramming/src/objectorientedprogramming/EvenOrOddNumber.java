package objectorientedprogramming;

import java.util.Scanner;

public class EvenOrOddNumber {
    
    public static void main(String[] args) {
        
        
        System.out.print("Enter an Integer Number: ");
        
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        if(number % 2 == 0)  {
            System.out.println(number +" is Even");
        }
        
        else{
            System.out.println(number+" is Odd");
        }
        
        
    }
    
    
}
