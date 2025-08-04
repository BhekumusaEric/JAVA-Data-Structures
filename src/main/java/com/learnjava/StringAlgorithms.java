package com.learnjava;

import java.util.List;

/**
 * A class containing classic string algorithms and problems.
 * Perfect for learning Java string manipulation and algorithms!
 * 
 * Your task: Make all the unit tests pass by implementing the methods below!
 */
public class StringAlgorithms {
    
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
     * Counts the frequency of each character in a string
     * @param str the string to analyze
     * @return a string representation of character frequencies
     */
    public String getCharacterFrequency(String str) {
        // TODO: Implement this method
        // Hint: Use a Map<Character, Integer> or array for counting
        // Return format: "a:2, b:1, c:3" (sorted by character)
        return null;
    }
    
    /**
     * Finds the longest word in a sentence
     * @param sentence the sentence to analyze
     * @return the longest word
     */
    public String findLongestWord(String sentence) {
        // TODO: Implement this method
        // Hint: Split by spaces and compare lengths
        return null;
    }
    
    /**
     * Removes duplicate characters from a string (keeping first occurrence)
     * @param str the string to process
     * @return string with duplicates removed
     */
    public String removeDuplicates(String str) {
        // TODO: Implement this method
        // Hint: Use a Set to track seen characters
        return null;
    }
    
    /**
     * Checks if a string contains only digits
     * @param str the string to check
     * @return true if string contains only digits, false otherwise
     */
    public boolean isNumeric(String str) {
        // TODO: Implement this method
        // Hint: Check each character with Character.isDigit()
        return false;
    }
    
    /**
     * Capitalizes the first letter of each word in a sentence
     * @param sentence the sentence to process
     * @return sentence with each word capitalized
     */
    public String capitalizeWords(String sentence) {
        // TODO: Implement this method
        // Hint: Split by spaces, capitalize each word, join back
        return null;
    }
    
    /**
     * Finds the first non-repeating character in a string
     * @param str the string to analyze
     * @return the first non-repeating character, or null if none found
     */
    public Character findFirstNonRepeatingChar(String str) {
        // TODO: Implement this method
        // Hint: Count frequencies, then find first char with count = 1
        return null;
    }
    
    /**
     * Checks if one string is a rotation of another
     * @param str1 first string
     * @param str2 second string
     * @return true if str2 is a rotation of str1, false otherwise
     */
    public boolean isRotation(String str1, String str2) {
        // TODO: Implement this method
        // Hint: If str2 is a rotation of str1, then str2 will be a substring of str1+str1
        return false;
    }
    
    /**
     * Compresses a string using basic run-length encoding
     * @param str the string to compress
     * @return compressed string (e.g., "aabcccccaaa" -> "a2b1c5a3")
     */
    public String compressString(String str) {
        // TODO: Implement this method
        // Hint: Count consecutive characters and build result
        return null;
    }
}
