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
	    Scanner scanner = new Scanner(System.in);
	    
	    while (true) {
	        System.out.println("\nEnter operation (add, subtract, multiply, divide, pow, sqrt, log, log10, sin, cos, tan, factorial) or 'exit' to quit:");
	        String operation = scanner.next();
	        
	        if (operation.equalsIgnoreCase("exit")) {
	            System.out.println("Exiting calculator...");
	            break;
	        }

	        // For operations requiring two inputs
	        if (!operation.equalsIgnoreCase("sqrt") && !operation.equalsIgnoreCase("log") && !operation.equalsIgnoreCase("log10") && !operation.equalsIgnoreCase("sin") && !operation.equalsIgnoreCase("cos") && !operation.equalsIgnoreCase("tan") && !operation.equalsIgnoreCase("factorial")) {
	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();
	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();

	            switch (operation.toLowerCase()) {
	                case "add":
	                    System.out.println("Result: " + add(num1, num2));
	                    break;
	                case "subtract":
	                    System.out.println("Result: " + subtract(num1, num2));
	                    break;
	                case "multiply":
	                    System.out.println("Result: " + multiply(num1, num2));
	                    break;
	                case "divide":
	                    System.out.println("Result: " + divide(num1, num2));
	                    break;
	                case "pow":
	                    System.out.println("Result: " + power(num1, num2));
	                    break;
	                default:
	                    System.out.println("Invalid operation.");
	                    break;
	            }
	        } else {
	            // For operations requiring one input
	            System.out.print("Enter number: ");
	            double num = scanner.nextDouble();

	            switch (operation.toLowerCase()) {
	                case "sqrt":
	                    System.out.println("Result: " + sqrt(num));
	                    break;
	                case "log":
	                    System.out.println("Result: " + log(num));
	                    break;
	                case "log10":
	                    System.out.println("Result: " + log10(num));
	                    break;
	                case "sin":
	                    System.out.println("Result: " + sin(num));
	                    break;
	                case "cos":
	                    System.out.println("Result: " + cos(num));
	                    break;
	                case "tan":
	                    System.out.println("Result: " + tan(num));
	                    break;
	                case "factorial":
	                    // Factorial is a special case requiring an integer
	                    System.out.println("Result: " + factorial((int)num));
	                    break;
	                default:
	                    System.out.println("Invalid operation.");
	                    break;
	            }
	        }
	    }
	    
	    scanner.close();
	}


//	public static void main(String[] args) {
//        // If arguments exist, user has to choose the operation.
//		if (args.length > 0) {
//        	Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter operation (e.g., add, subtract, multiply, divide or Factorial):");
//            String operation = scanner.next();
//            switch (operation.toLowerCase()) {
//            case "add":
//                double num1 = Double.parseDouble(args[0]);
//                double num2 = Double.parseDouble(args[1]);
//                System.out.println("Result: " + add(num1, num2));
//                break;
//            case "multiply":
//	            double numM1 = Double.parseDouble(args[0]);
//	            double numM2 = Double.parseDouble(args[1]);
//	            System.out.println("Result: " + multiply(numM1, numM2));
//	            break;
//            case "divide":
//	            double numD1 = Double.parseDouble(args[0]);
//	            double numD2 = Double.parseDouble(args[1]);
//	            if (numD2 != 0) { 
//	            	System.out.println("Result: " + divide(numD1, numD2));
//	            } else {
//	            	System.out.println("Zero Error Division !");
//	            }
//	            break;
//            case "factorial":
//                int number = Integer.parseInt(args[0]);
//                System.out.println("Result: " + factorial(number));
//                break;
//            case "subtract":
//                double numS1 = Double.parseDouble(args[0]);
//                double numS2 = Double.parseDouble(args[1]);
//                System.out.println("Result: " + subtract(numS1, numS2));
//                break;
//            }
//            scanner.close();
//        // If arguments are not provided, user has to type the numbers.
//        } else {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter operation (e.g., add, subtract, multiply, divide or Factorial):");
//            String operation = scanner.next();
//            switch (operation.toLowerCase()) {
//            case "add":
//                System.out.println("Enter the first operand:");
//                double num1 = scanner.nextDouble();
//                System.out.println("Enter the second operand:");
//                double num2 = scanner.nextDouble();
//                System.out.println("Result: " + add(num1, num2));
//                break;
//            case "multiply":
//	            System.out.println("Enter the first operand:");
//	            double numM1 = scanner.nextDouble();
//	            System.out.println("Enter the second operand:");
//	            double numM2 = scanner.nextDouble();
//	            System.out.println("Result: " + multiply(numM1, numM2));
//	            break;
//            case "divide":
//	            System.out.println("Enter the first operand:");
//	            double numD1 = scanner.nextDouble();
//	            System.out.println("Enter the second operand:");
//	            double numD2 = scanner.nextDouble();
//	            System.out.println("Result: " + divide(numD1, numD2));
//	            break;
//            case "factorial":
//                System.out.println("Enter a number:");
//                int number = scanner.nextInt();
//                System.out.println("Result: " + factorial(number));
//                break;
//            case "subtract":
//                System.out.println("Enter the first operand:");
//                double numS1 = scanner.nextDouble();
//                System.out.println("Enter the second operand:");
//                double numS2 = scanner.nextDouble();
//                System.out.println("Result: " + subtract(numS1, numS2));
//                break;
//            }
//            scanner.close();
//        } 
//    }
	// Takes 2 doubles as arguments, adds them an returns the result.
	public static double add(double a, double b) {
	    return a + b;
	}
	// Takes 1 double as an argument, calculates factorial an returns the result.

	public static long factorial(int num) {
	    if (num < 0) {
	        System.out.println("Factorial of negative number is undefined.");
	        return 0;
	    }
	    return factorialHelper(num, num);
	}

	private static long factorialHelper(int originalNum, int num) {
	    if (num <= 1) {
	        return 1;
	    }
	    // Calculate progress and update progress bar
	    int progress = (int) (((originalNum - num) / (double) originalNum) * 100);
	    System.out.print("\rCalculating factorial: " + progress + "%");
	    return num * factorialHelper(originalNum, num - 1);
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
	
	// Exponentiation
	public static double power(double base, double exponent) {
	    return Math.pow(base, exponent);
	}

	// Square root
	public static double sqrt(double number) {
	    return Math.sqrt(number);
	}

	// Natural logarithm
	public static double log(double number) {
	    return Math.log(number);
	}

	// Base-10 logarithm
	public static double log10(double number) {
	    return Math.log10(number);
	}

	// Sine function
	public static double sin(double angleDegrees) {
	    double angleRadians = Math.toRadians(angleDegrees);
		return Math.sin(angleRadians);
	}

	// Cosine function
	public static double cos(double angleDegrees) {
		double angleRadians = Math.toRadians(angleDegrees);
		return Math.cos(angleRadians);
	}

	// Tangent function
	public static double tan(double angleDegrees) {
		double angleRadians = Math.toRadians(angleDegrees);
		return Math.tan(angleRadians);
	}



}
