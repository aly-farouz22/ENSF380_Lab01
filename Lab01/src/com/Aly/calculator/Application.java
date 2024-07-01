/**
 * <h1 > Application .java </h1 >
 * <p>
 * This class is designed for processing XXX in Java .
 * It is part of Lab 1 Exercise C.
 * </p>
 * <p>
 * <b> Note :</b> This file represents ...
 * </p>
 *
 * <p><b> Submission Date :</b> July 4, 2024 </p>
 *
 * @author Aly Farouz
 * @version 1.0
 *  */
package com.Aly.calculator;
import java.util.*;
public class Application {

	public static void main(String[] args) {
        // If arguments exist, user has to choose the operation.
		if (args.length > 0) {
        	Scanner scanner = new Scanner(System.in);
            System.out.println("Enter operation (e.g., add, subtract, multiply, divide or Factorial):");
            String operation = scanner.next();
            switch (operation.toLowerCase()) {
            case "add":
                double num1 = Double.parseDouble(args[0]);
                double num2 = Double.parseDouble(args[1]);
                System.out.println("Result: " + add(num1, num2));
                break;
            case "multiply":
	            double numM1 = Double.parseDouble(args[0]);
	            double numM2 = Double.parseDouble(args[1]);
	            System.out.println("Result: " + multiply(numM1, numM2));
	            break;
            case "divide":
	            double numD1 = Double.parseDouble(args[0]);
	            double numD2 = Double.parseDouble(args[1]);
	            if (numD2 != 0) { 
	            	System.out.println("Result: " + divide(numD1, numD2));
	            } else {
	            	System.out.println("Zero Error Division !");
	            }
	            break;
            case "factorial":
                double number = Double.parseDouble(args[0]);
                System.out.println("Result: " + factorial(number));
                break;
            case "subtract":
                double numS1 = Double.parseDouble(args[0]);
                double numS2 = Double.parseDouble(args[1]);
                System.out.println("Result: " + subtract(numS1, numS2));
                break;
            }
            scanner.close();
        // If arguments are not provided, user has to type the numbers.
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter operation (e.g., add, subtract, multiply, divide or Factorial):");
            String operation = scanner.next();
            switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Enter the first operand:");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                double num2 = scanner.nextDouble();
                System.out.println("Result: " + add(num1, num2));
                break;
            case "multiply":
	            System.out.println("Enter the first operand:");
	            double numM1 = scanner.nextDouble();
	            System.out.println("Enter the second operand:");
	            double numM2 = scanner.nextDouble();
	            System.out.println("Result: " + multiply(numM1, numM2));
	            break;
            case "divide":
	            System.out.println("Enter the first operand:");
	            double numD1 = scanner.nextDouble();
	            System.out.println("Enter the second operand:");
	            double numD2 = scanner.nextDouble();
	            System.out.println("Result: " + divide(numD1, numD2));
	            break;
            case "factorial":
                System.out.println("Enter a number:");
                double number = scanner.nextDouble();
                System.out.println("Result: " + factorial(number));
                break;
            case "subtract":
                System.out.println("Enter the first operand:");
                double numS1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                double numS2 = scanner.nextDouble();
                System.out.println("Result: " + subtract(numS1, numS2));
                break;
            }
            scanner.close();
        } 
    }
	// Takes 2 doubles as arguments, adds them an returns the result.
	public static double add(double a, double b) {
	    return a + b;
	}
	// Takes 1 double as an argument, calculates factorial an returns the result.
	public static double factorial(double n) {
	    if (n <= 1) {
	        return 1;
	    } else {
	        return n * factorial(n - 1);
	    }
	}
	// Takes 2 doubles as arguments, multiplies them an returns the result.
	public static double multiply(double a, double b) {
	    return a * b;
	}
	// Takes 2 doubles as arguments, subtracts them an returns the result.
	public static double subtract(double a, double b) {
	    return a - b;
	}
	// Takes 2 doubles as arguments, divides them an returns the result.
	public static double divide(double a, double b) {
	    return a / b;
	}


}
