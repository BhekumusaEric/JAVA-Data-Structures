package com.learnjava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.*;

/**
 * Unit tests for StringAlgorithms class.
 * Run these tests to check your string algorithm implementations!
 * 
 * To run tests: mvn test
 * To run only this test class: mvn test -Dtest=StringAlgorithmsTest
 */
@DisplayName("String Algorithms Tests")
public class StringAlgorithmsTest {
    
    private StringAlgorithms stringAlgorithms;
    
    @BeforeEach
    void setUp() {
        stringAlgorithms = new StringAlgorithms();
    }
    
    @Test
    @DisplayName("Should check if string is palindrome correctly")
    void shouldCheckIfStringIsPalindrome() {
        // Simple palindromes
        assertThat(stringAlgorithms.isPalindrome("racecar")).isTrue();
        assertThat(stringAlgorithms.isPalindrome("level")).isTrue();
        assertThat(stringAlgorithms.isPalindrome("madam")).isTrue();
        assertThat(stringAlgorithms.isPalindrome("a")).isTrue();
        assertThat(stringAlgorithms.isPalindrome("")).isTrue();
        
        // Non-palindromes
        assertThat(stringAlgorithms.isPalindrome("hello")).isFalse();
        assertThat(stringAlgorithms.isPalindrome("world")).isFalse();
        assertThat(stringAlgorithms.isPalindrome("java")).isFalse();
        
        // Case sensitivity (should handle both cases)
        assertThat(stringAlgorithms.isPalindrome("Racecar")).isTrue();
        assertThat(stringAlgorithms.isPalindrome("Level")).isTrue();
    }
    
    @Test
    @DisplayName("Should check if strings are anagrams correctly")
    void shouldCheckIfStringsAreAnagrams() {
        // Valid anagrams
        assertThat(stringAlgorithms.areAnagrams("listen", "silent")).isTrue();
        assertThat(stringAlgorithms.areAnagrams("evil", "vile")).isTrue();
        assertThat(stringAlgorithms.areAnagrams("a", "a")).isTrue();
        assertThat(stringAlgorithms.areAnagrams("", "")).isTrue();
        
        // Non-anagrams
        assertThat(stringAlgorithms.areAnagrams("hello", "world")).isFalse();
        assertThat(stringAlgorithms.areAnagrams("java", "python")).isFalse();
        assertThat(stringAlgorithms.areAnagrams("abc", "def")).isFalse();
        
        // Different lengths
        assertThat(stringAlgorithms.areAnagrams("abc", "abcd")).isFalse();
        
        // Case sensitivity
        assertThat(stringAlgorithms.areAnagrams("Listen", "Silent")).isTrue();
    }
    
    @Test
    @DisplayName("Should reverse string correctly")
    void shouldReverseString() {
        assertThat(stringAlgorithms.reverseString("hello")).isEqualTo("olleh");
        assertThat(stringAlgorithms.reverseString("world")).isEqualTo("dlrow");
        assertThat(stringAlgorithms.reverseString("a")).isEqualTo("a");
        assertThat(stringAlgorithms.reverseString("")).isEqualTo("");
        assertThat(stringAlgorithms.reverseString("12345")).isEqualTo("54321");
    }
    
    @Test
    @DisplayName("Should count vowels correctly")
    void shouldCountVowels() {
        assertThat(stringAlgorithms.countVowels("hello")).isEqualTo(2); // e, o
        assertThat(stringAlgorithms.countVowels("aeiou")).isEqualTo(5); // all vowels
        assertThat(stringAlgorithms.countVowels("bcdfg")).isEqualTo(0); // no vowels
        assertThat(stringAlgorithms.countVowels("")).isEqualTo(0); // empty string
        assertThat(stringAlgorithms.countVowels("HELLO")).isEqualTo(2); // uppercase
        assertThat(stringAlgorithms.countVowels("Programming")).isEqualTo(3); // o, a, i
    }
    
    @Test
    @DisplayName("Should get character frequency correctly")
    void shouldGetCharacterFrequency() {
        assertThat(stringAlgorithms.getCharacterFrequency("hello")).isEqualTo("e:1, h:1, l:2, o:1");
        assertThat(stringAlgorithms.getCharacterFrequency("aab")).isEqualTo("a:2, b:1");
        assertThat(stringAlgorithms.getCharacterFrequency("")).isEqualTo("");
        assertThat(stringAlgorithms.getCharacterFrequency("a")).isEqualTo("a:1");
    }
    
    @Test
    @DisplayName("Should find longest word correctly")
    void shouldFindLongestWord() {
        assertThat(stringAlgorithms.findLongestWord("The quick brown fox")).isEqualTo("quick");
        assertThat(stringAlgorithms.findLongestWord("Java programming is fun")).isEqualTo("programming");
        assertThat(stringAlgorithms.findLongestWord("a")).isEqualTo("a");
        assertThat(stringAlgorithms.findLongestWord("hello world")).isEqualTo("hello"); // first if tie
    }
    
    @Test
    @DisplayName("Should remove duplicates correctly")
    void shouldRemoveDuplicates() {
        assertThat(stringAlgorithms.removeDuplicates("hello")).isEqualTo("helo");
        assertThat(stringAlgorithms.removeDuplicates("programming")).isEqualTo("progamin");
        assertThat(stringAlgorithms.removeDuplicates("aab")).isEqualTo("ab");
        assertThat(stringAlgorithms.removeDuplicates("")).isEqualTo("");
        assertThat(stringAlgorithms.removeDuplicates("abc")).isEqualTo("abc");
    }
    
    @Test
    @DisplayName("Should check if string is numeric correctly")
    void shouldCheckIfStringIsNumeric() {
        assertThat(stringAlgorithms.isNumeric("12345")).isTrue();
        assertThat(stringAlgorithms.isNumeric("0")).isTrue();
        assertThat(stringAlgorithms.isNumeric("")).isFalse(); // empty string
        assertThat(stringAlgorithms.isNumeric("123a")).isFalse();
        assertThat(stringAlgorithms.isNumeric("12.34")).isFalse(); // decimal point
        assertThat(stringAlgorithms.isNumeric("-123")).isFalse(); // negative sign
    }
    
    @Test
    @DisplayName("Should capitalize words correctly")
    void shouldCapitalizeWords() {
        assertThat(stringAlgorithms.capitalizeWords("hello world")).isEqualTo("Hello World");
        assertThat(stringAlgorithms.capitalizeWords("java programming")).isEqualTo("Java Programming");
        assertThat(stringAlgorithms.capitalizeWords("a")).isEqualTo("A");
        assertThat(stringAlgorithms.capitalizeWords("")).isEqualTo("");
        assertThat(stringAlgorithms.capitalizeWords("HELLO WORLD")).isEqualTo("Hello World");
    }
    
    @Test
    @DisplayName("Should find first non-repeating character correctly")
    void shouldFindFirstNonRepeatingChar() {
        assertThat(stringAlgorithms.findFirstNonRepeatingChar("hello")).isEqualTo('h');
        assertThat(stringAlgorithms.findFirstNonRepeatingChar("aab")).isEqualTo('b');
        assertThat(stringAlgorithms.findFirstNonRepeatingChar("aabb")).isNull();
        assertThat(stringAlgorithms.findFirstNonRepeatingChar("abccba")).isNull();
        assertThat(stringAlgorithms.findFirstNonRepeatingChar("a")).isEqualTo('a');
    }
    
    @Test
    @DisplayName("Should check if string is rotation correctly")
    void shouldCheckIfStringIsRotation() {
        assertThat(stringAlgorithms.isRotation("abcde", "cdeab")).isTrue();
        assertThat(stringAlgorithms.isRotation("hello", "llohe")).isTrue();
        assertThat(stringAlgorithms.isRotation("abc", "bca")).isTrue();
        assertThat(stringAlgorithms.isRotation("abc", "def")).isFalse();
        assertThat(stringAlgorithms.isRotation("abc", "abcd")).isFalse(); // different lengths
        assertThat(stringAlgorithms.isRotation("", "")).isTrue();
    }
    
    @Test
    @DisplayName("Should compress string correctly")
    void shouldCompressString() {
        assertThat(stringAlgorithms.compressString("aabcccccaaa")).isEqualTo("a2b1c5a3");
        assertThat(stringAlgorithms.compressString("abc")).isEqualTo("a1b1c1");
        assertThat(stringAlgorithms.compressString("aaa")).isEqualTo("a3");
        assertThat(stringAlgorithms.compressString("")).isEqualTo("");
        assertThat(stringAlgorithms.compressString("a")).isEqualTo("a1");
    }
}
