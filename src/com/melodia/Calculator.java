
package com.melodia;

import java.util.Scanner;

public class Calculator {
    
    private double firstNumber;
    private double secondNumber;
    
    Scanner scanner = new Scanner(System.in);
    
    public Calculator() {
        
        System.out.print("Enter first number: ");
        firstNumber = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Enter second number: ");
        secondNumber = Double.parseDouble(scanner.nextLine());
   
    }
    
    public void addition(){
        
        double sum = firstNumber + secondNumber;
        System.out.println("Sum: " + sum);
   }
    
    public void subtraction(){
        
        double difference = firstNumber - secondNumber;
        System.out.println("Difference: " + difference);
    }
    
    public void division(){
        
         double quotient = firstNumber / secondNumber;
        System.out.println("Division: " + quotient);
        
    }
    
    public void multiplication(){
        
         double product = firstNumber * secondNumber;
        System.out.println("Multiplication: " + product);
        
   }
    

    public static void main(String[] args) {
        
        Calculator c = new Calculator();
        c.addition();
        c.subtraction();
        c.multiplication();
        c.division();
       
        
    }
    
}
