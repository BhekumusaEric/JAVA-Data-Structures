package com.learnjava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.*;

/**
 * Unit tests for MyStack class.
 * Run these tests to check your implementation!
 * 
 * To run tests: mvn test
 * To run only this test class: mvn test -Dtest=MyStackTest
 */
@DisplayName("MyStack Tests")
public class MyStackTest {
    
    private MyStack<String> stringStack;
    private MyStack<Integer> intStack;
    
    @BeforeEach
    void setUp() {
        stringStack = new MyStack<>();
        intStack = new MyStack<>();
    }
    
    @Test
    @DisplayName("Should create empty stack")
    void shouldCreateEmptyStack() {
        assertThat(stringStack.size()).isEqualTo(0);
        assertThat(stringStack.isEmpty()).isTrue();
    }
    
    @Test
    @DisplayName("Should push items onto stack")
    void shouldPushItems() {
        stringStack.push("First");
        stringStack.push("Second");
        stringStack.push("Third");
        
        assertThat(stringStack.size()).isEqualTo(3);
        assertThat(stringStack.isEmpty()).isFalse();
    }
    
    @Test
    @DisplayName("Should pop items from stack in LIFO order")
    void shouldPopItemsInLIFOOrder() {
        stringStack.push("First");
        stringStack.push("Second");
        stringStack.push("Third");
        
        assertThat(stringStack.pop()).isEqualTo("Third");
        assertThat(stringStack.pop()).isEqualTo("Second");
        assertThat(stringStack.pop()).isEqualTo("First");
        
        assertThat(stringStack.size()).isEqualTo(0);
        assertThat(stringStack.isEmpty()).isTrue();
    }
    
    @Test
    @DisplayName("Should peek at top item without removing it")
    void shouldPeekAtTopItem() {
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        
        assertThat(intStack.peek()).isEqualTo(30);
        assertThat(intStack.size()).isEqualTo(3); // Size should not change
        
        assertThat(intStack.peek()).isEqualTo(30); // Should still be 30
    }
    
    @Test
    @DisplayName("Should throw exception when popping from empty stack")
    void shouldThrowExceptionWhenPoppingFromEmptyStack() {
        assertThatThrownBy(() -> stringStack.pop())
            .isInstanceOf(RuntimeException.class)
            .hasMessageContaining("empty");
    }
    
    @Test
    @DisplayName("Should throw exception when peeking at empty stack")
    void shouldThrowExceptionWhenPeekingAtEmptyStack() {
        assertThatThrownBy(() -> stringStack.peek())
            .isInstanceOf(RuntimeException.class)
            .hasMessageContaining("empty");
    }
    
    @Test
    @DisplayName("Should search for items in stack")
    void shouldSearchForItems() {
        stringStack.push("Bottom");
        stringStack.push("Middle");
        stringStack.push("Top");
        
        // Position 1 is the top of the stack
        assertThat(stringStack.search("Top")).isEqualTo(1);
        assertThat(stringStack.search("Middle")).isEqualTo(2);
        assertThat(stringStack.search("Bottom")).isEqualTo(3);
        assertThat(stringStack.search("NotFound")).isEqualTo(-1);
    }
    
    @Test
    @DisplayName("Should handle mixed operations correctly")
    void shouldHandleMixedOperations() {
        intStack.push(1);
        intStack.push(2);
        
        assertThat(intStack.pop()).isEqualTo(2);
        
        intStack.push(3);
        intStack.push(4);
        
        assertThat(intStack.peek()).isEqualTo(4);
        assertThat(intStack.size()).isEqualTo(3);
        
        assertThat(intStack.pop()).isEqualTo(4);
        assertThat(intStack.pop()).isEqualTo(3);
        assertThat(intStack.pop()).isEqualTo(1);
        
        assertThat(intStack.isEmpty()).isTrue();
    }
    
    @Test
    @DisplayName("Should handle null values")
    void shouldHandleNullValues() {
        stringStack.push("NotNull");
        stringStack.push(null);
        stringStack.push("AlsoNotNull");
        
        assertThat(stringStack.pop()).isEqualTo("AlsoNotNull");
        assertThat(stringStack.pop()).isNull();
        assertThat(stringStack.pop()).isEqualTo("NotNull");
    }
    
    @Test
    @DisplayName("Should maintain correct size during operations")
    void shouldMaintainCorrectSize() {
        assertThat(intStack.size()).isEqualTo(0);
        
        intStack.push(1);
        assertThat(intStack.size()).isEqualTo(1);
        
        intStack.push(2);
        assertThat(intStack.size()).isEqualTo(2);
        
        intStack.pop();
        assertThat(intStack.size()).isEqualTo(1);
        
        intStack.pop();
        assertThat(intStack.size()).isEqualTo(0);
    }
}
