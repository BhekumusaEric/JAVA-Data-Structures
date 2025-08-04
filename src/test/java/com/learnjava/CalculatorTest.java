package com.learnjava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Unit tests for Calculator class.
 * Run these tests to check your implementation!
 * 
 * To run tests: mvn test
 * To run only this test class: mvn test -Dtest=CalculatorTest
 */
@DisplayName("Calculator Tests")
public class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    @DisplayName("Should add two numbers correctly")
    void shouldAddTwoNumbers() {
        assertThat(calculator.add(5.0, 3.0)).isEqualTo(8.0);
        assertThat(calculator.add(-2.5, 1.5)).isEqualTo(-1.0);
        assertThat(calculator.add(0, 0)).isEqualTo(0.0);
    }
    
    @Test
    @DisplayName("Should subtract two numbers correctly")
    void shouldSubtractTwoNumbers() {
        assertThat(calculator.subtract(10.0, 4.0)).isEqualTo(6.0);
        assertThat(calculator.subtract(1.5, 2.5)).isEqualTo(-1.0);
        assertThat(calculator.subtract(0, 5)).isEqualTo(-5.0);
    }
    
    @Test
    @DisplayName("Should multiply two numbers correctly")
    void shouldMultiplyTwoNumbers() {
        assertThat(calculator.multiply(4.0, 3.0)).isEqualTo(12.0);
        assertThat(calculator.multiply(-2.0, 5.0)).isEqualTo(-10.0);
        assertThat(calculator.multiply(0, 100)).isEqualTo(0.0);
    }
    
    @Test
    @DisplayName("Should divide two numbers correctly")
    void shouldDivideTwoNumbers() {
        assertThat(calculator.divide(15.0, 3.0)).isEqualTo(5.0);
        assertThat(calculator.divide(7.0, 2.0)).isEqualTo(3.5);
        assertThat(calculator.divide(-10.0, 2.0)).isEqualTo(-5.0);
    }
    
    @Test
    @DisplayName("Should throw exception when dividing by zero")
    void shouldThrowExceptionWhenDividingByZero() {
        assertThatThrownBy(() -> calculator.divide(10.0, 0.0))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("zero");
    }
    
    @Test
    @DisplayName("Should calculate factorial correctly")
    void shouldCalculateFactorial() {
        assertThat(calculator.factorial(0)).isEqualTo(1);
        assertThat(calculator.factorial(1)).isEqualTo(1);
        assertThat(calculator.factorial(5)).isEqualTo(120);
        assertThat(calculator.factorial(6)).isEqualTo(720);
    }
    
    @Test
    @DisplayName("Should throw exception for negative factorial")
    void shouldThrowExceptionForNegativeFactorial() {
        assertThatThrownBy(() -> calculator.factorial(-1))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("negative");
    }
    
    @Test
    @DisplayName("Should calculate Fibonacci numbers correctly")
    void shouldCalculateFibonacci() {
        assertThat(calculator.fibonacci(0)).isEqualTo(0);
        assertThat(calculator.fibonacci(1)).isEqualTo(1);
        assertThat(calculator.fibonacci(2)).isEqualTo(1);
        assertThat(calculator.fibonacci(3)).isEqualTo(2);
        assertThat(calculator.fibonacci(4)).isEqualTo(3);
        assertThat(calculator.fibonacci(5)).isEqualTo(5);
        assertThat(calculator.fibonacci(6)).isEqualTo(8);
        assertThat(calculator.fibonacci(10)).isEqualTo(55);
    }
    
    @Test
    @DisplayName("Should throw exception for negative Fibonacci")
    void shouldThrowExceptionForNegativeFibonacci() {
        assertThatThrownBy(() -> calculator.fibonacci(-1))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("negative");
    }
    
    @Test
    @DisplayName("Should find maximum number in list")
    void shouldFindMaximumNumber() {
        List<Double> numbers = Arrays.asList(3.5, 1.2, 8.9, 2.1, 5.7);
        assertThat(calculator.findMax(numbers)).isEqualTo(8.9);
        
        List<Double> negativeNumbers = Arrays.asList(-1.0, -5.0, -2.0);
        assertThat(calculator.findMax(negativeNumbers)).isEqualTo(-1.0);
        
        List<Double> singleNumber = Collections.singletonList(42.0);
        assertThat(calculator.findMax(singleNumber)).isEqualTo(42.0);
    }
    
    @Test
    @DisplayName("Should throw exception for null or empty list in findMax")
    void shouldThrowExceptionForNullOrEmptyListInFindMax() {
        assertThatThrownBy(() -> calculator.findMax(null))
            .isInstanceOf(IllegalArgumentException.class);
        
        assertThatThrownBy(() -> calculator.findMax(Collections.emptyList()))
            .isInstanceOf(IllegalArgumentException.class);
    }
    
    @Test
    @DisplayName("Should calculate average correctly")
    void shouldCalculateAverage() {
        List<Double> numbers = Arrays.asList(2.0, 4.0, 6.0, 8.0);
        assertThat(calculator.calculateAverage(numbers)).isEqualTo(5.0);
        
        List<Double> singleNumber = Collections.singletonList(10.0);
        assertThat(calculator.calculateAverage(singleNumber)).isEqualTo(10.0);
        
        List<Double> decimals = Arrays.asList(1.5, 2.5, 3.0);
        assertThat(calculator.calculateAverage(decimals)).isCloseTo(2.333, within(0.001));
    }
    
    @Test
    @DisplayName("Should throw exception for null or empty list in calculateAverage")
    void shouldThrowExceptionForNullOrEmptyListInCalculateAverage() {
        assertThatThrownBy(() -> calculator.calculateAverage(null))
            .isInstanceOf(IllegalArgumentException.class);
        
        assertThatThrownBy(() -> calculator.calculateAverage(Collections.emptyList()))
            .isInstanceOf(IllegalArgumentException.class);
    }
    
    @Test
    @DisplayName("Should check if number is prime correctly")
    void shouldCheckIfNumberIsPrime() {
        // Prime numbers
        assertThat(calculator.isPrime(2)).isTrue();
        assertThat(calculator.isPrime(3)).isTrue();
        assertThat(calculator.isPrime(5)).isTrue();
        assertThat(calculator.isPrime(7)).isTrue();
        assertThat(calculator.isPrime(11)).isTrue();
        assertThat(calculator.isPrime(13)).isTrue();
        assertThat(calculator.isPrime(17)).isTrue();
        
        // Non-prime numbers
        assertThat(calculator.isPrime(1)).isFalse();
        assertThat(calculator.isPrime(4)).isFalse();
        assertThat(calculator.isPrime(6)).isFalse();
        assertThat(calculator.isPrime(8)).isFalse();
        assertThat(calculator.isPrime(9)).isFalse();
        assertThat(calculator.isPrime(10)).isFalse();
        assertThat(calculator.isPrime(15)).isFalse();
        
        // Edge cases
        assertThat(calculator.isPrime(0)).isFalse();
        assertThat(calculator.isPrime(-5)).isFalse();
    }
}
