package com.learnjava;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A Calculator class to practice Java process flow and control structures.
 * 
 * Your task: Make all the unit tests pass by implementing the methods below!
 */
public class Calculator {
    
    /**
     * Adds two numbers
     * @param a first number
     * @param b second number
     * @return the sum of a and b
     */
    public double add(double a, double b) {
        // TODO: Implement this method
        return a + b;
    }
    
    /**
     * Subtracts two numbers
     * @param a first number
     * @param b second number
     * @return a minus b
     */
    public double subtract(double a, double b) {
        // TODO: Implement this method
        return a - b;
    }
    
    /**
     * Multiplies two numbers
     * @param a first number
     * @param b second number
     * @return the product of a and b
     */
    public double multiply(double a, double b) {
        // TODO: Implement this method
        return a * b;
    }
    
    /**
     * Divides two numbers
     * @param a dividend
     * @param b divisor
     * @return a divided by b
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(double a, double b) {
        // TODO: Implement this method
        // Remember to handle division by zero!
        if (a <= 0) throw  new IllegalArgumentException("zero division is prohibited");
        return b / a;
    }
    
    /**
     * Calculates the factorial of a number using recursion
     * @param n the number (must be non-negative)
     * @return n! (n factorial)
     * @throws IllegalArgumentException if n is negative
     */
    public long factorial(int n) {
        /*
         TODO: Implement this method using recursion
         Hint: factorial(0) = 1, factorial(n) = n * factorial(n-1)
        */
        if (n <= 0) return  1;
        long l = n * factorial(n - 1);
        return l;
    }
    
    /**
     * Calculates the nth Fibonacci number using iteration
     * @param n the position in the Fibonacci sequence (0-based)
     * @return the nth Fibonacci number
     * @throws IllegalArgumentException if n is negative
     */
    public long fibonacci(int n) {
        // TODO: Implement this method using iteration (loops)
        // Hint: fib(0) = 0, fib(1) = 1, fib(n) = fib(n-1) + fib(n-2)
        return 0;
    }
    
    /**
     * Finds the maximum number in a list
     * @param numbers list of numbers
     * @return the maximum number
     * @throws IllegalArgumentException if the list is null or empty
     */
    public double findMax(List<Double> numbers) {
        // TODO: Implement this method
        // Use enhanced for loop (for-each loop)
        return  numbers.stream()
                .mapToDouble(Double :: doubleValue)
                .max()
                .orElse(Double.NEGATIVE_INFINITY);
    }

    /**
     * Calculates the average of numbers in a list
     * @param numbers list of numbers
     * @return the average
     * @throws IllegalArgumentException if the list is null or empty
     */
    public double calculateAverage(List<Double> numbers) {
        // TODO: Implement this method
        return 0;
    }
    
    /**
     * Checks if a number is prime
     * @param n the number to check
     * @return true if n is prime, false otherwise
     */
    public boolean isPrime(int n) {
        // TODO: Implement this method
        // Hint: A prime number is only divisible by 1 and itself
        // Numbers less than 2 are not prime
        if (n < 2) return  false;
        int factors = 0;
        for ( int i = 1; i <= n; ++i){
            if (n % i == 0) factors ++;
        }
        System.out.println(factors + "Of " + n);
        if (factors > 2) {
            return  false;
        } else {
            return true;
        }

    }



    /**
     * Finds the greatest common divisor (GCD) of two numbers using Euclidean algorithm
     * @param a first number
     * @param b second number
     * @return the GCD of a and b
     */
    public int gcd(int a, int b) {
        // TODO: Implement this method using recursion
        // Hint: gcd(a, b) = gcd(b, a % b), base case: gcd(a, 0) = a
        if (b == 0) return  a;
        if (a == 0 ) return b;
        BigInteger val_a = BigInteger.valueOf(a);
        BigInteger val_b = BigInteger.valueOf(b);
        return Integer.valueOf(String.valueOf(val_a.gcd(val_b)));
    }

    /**
     * Checks if a number is a perfect number (sum of its proper divisors equals the number)
     * @param n the number to check
     * @return true if n is a perfect number, false otherwise
     */
    public boolean isPerfectNumber(int n) {
        // TODO: Implement this method
        // Hint: Find all divisors less than n, sum them, compare to n
        // Example: 6 is perfect because 1 + 2 + 3 = 6
        if (n <= 0 ) return  false;
        int total = 0;
        for ( int i = 1;  i < n ; i ++ ){
            if (n % i == 0){
                total += i;
            }
        }
        if (total == n) return true;
        return false;
    }

    /**
     * Converts a decimal number to binary string
     * @param decimal the decimal number to convert
     * @return binary representation as string
     */
    public String decimalToBinary(int decimal) {
        // TODO: Implement this method
        // Hint: Repeatedly divide by 2 and collect remainders
        String bin = "";
        if (decimal == 0) return "0";
        while (decimal != 0){
            if (decimal % 2 == 0){
                decimal  /= 2 ;
                bin += "0";
            } else if ( decimal % 2 != 0) {
                bin += "1";
                decimal  /= 2;
            }
        }
        String rev = new StringBuilder(bin).reverse().toString();
        return rev;
    }

    /**
     * Finds the second largest number in an array
     * @param numbers array of integers
     * @return the second largest number
     * @throws IllegalArgumentException if array is null, empty, or has less than 2 elements
     */
    public int findSecondLargest(int[] numbers) {
        // TODO: Implement this method
        // Hint: Keep track of largest and second largest while iterating
        return 0;
    }
}
