package com.learnjava;

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
        return 0;
    }
    
    /**
     * Subtracts two numbers
     * @param a first number
     * @param b second number
     * @return a minus b
     */
    public double subtract(double a, double b) {
        // TODO: Implement this method
        return 0;
    }
    
    /**
     * Multiplies two numbers
     * @param a first number
     * @param b second number
     * @return the product of a and b
     */
    public double multiply(double a, double b) {
        // TODO: Implement this method
        return 0;
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
        return 0;
    }
    
    /**
     * Calculates the factorial of a number using recursion
     * @param n the number (must be non-negative)
     * @return n! (n factorial)
     * @throws IllegalArgumentException if n is negative
     */
    public long factorial(int n) {
        // TODO: Implement this method using recursion
        // Hint: factorial(0) = 1, factorial(n) = n * factorial(n-1)
        return 0;
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
        return 0;
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
        return false;
    }

    /**
     * Checks if a string is a palindrome (reads the same forwards and backwards)
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String str) {
        // TODO: Implement this method
        // Hint: Compare characters from start and end moving towards center
        // Consider ignoring case and spaces for a more robust solution
        return false;
    }

    /**
     * Checks if two strings are anagrams (contain the same characters in different order)
     * @param str1 first string
     * @param str2 second string
     * @return true if the strings are anagrams, false otherwise
     */
    public boolean areAnagrams(String str1, String str2) {
        // TODO: Implement this method
        // Hint: Sort the characters in both strings and compare
        // Or count frequency of each character
        return false;
    }

    /**
     * Reverses a string
     * @param str the string to reverse
     * @return the reversed string
     */
    public String reverseString(String str) {
        // TODO: Implement this method
        // Hint: Use StringBuilder or iterate backwards
        return null;
    }

    /**
     * Counts the number of vowels in a string
     * @param str the string to analyze
     * @return the number of vowels (a, e, i, o, u)
     */
    public int countVowels(String str) {
        // TODO: Implement this method
        // Hint: Check each character against vowels (consider both cases)
        return 0;
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
        return 0;
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
        return null;
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
