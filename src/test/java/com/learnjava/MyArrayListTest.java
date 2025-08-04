package com.learnjava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.*;

/**
 * Unit tests for MyArrayList class.
 * Run these tests to check your implementation!
 * 
 * To run tests: mvn test
 * To run only this test class: mvn test -Dtest=MyArrayListTest
 */
@DisplayName("MyArrayList Tests")
public class MyArrayListTest {
    
    private MyArrayList<String> stringList;
    private MyArrayList<Integer> intList;
    
    @BeforeEach
    void setUp() {
        stringList = new MyArrayList<>();
        intList = new MyArrayList<>();
    }
    
    @Test
    @DisplayName("Should create empty list")
    void shouldCreateEmptyList() {
        assertThat(stringList.size()).isEqualTo(0);
        assertThat(stringList.isEmpty()).isTrue();
    }
    
    @Test
    @DisplayName("Should add items to list")
    void shouldAddItems() {
        stringList.add("Hello");
        stringList.add("World");
        
        assertThat(stringList.size()).isEqualTo(2);
        assertThat(stringList.isEmpty()).isFalse();
        assertThat(stringList.get(0)).isEqualTo("Hello");
        assertThat(stringList.get(1)).isEqualTo("World");
    }
    
    @Test
    @DisplayName("Should get items by index")
    void shouldGetItemsByIndex() {
        intList.add(10);
        intList.add(20);
        intList.add(30);
        
        assertThat(intList.get(0)).isEqualTo(10);
        assertThat(intList.get(1)).isEqualTo(20);
        assertThat(intList.get(2)).isEqualTo(30);
    }
    
    @Test
    @DisplayName("Should throw exception for invalid index")
    void shouldThrowExceptionForInvalidIndex() {
        stringList.add("Test");
        
        assertThatThrownBy(() -> stringList.get(-1))
            .isInstanceOf(IndexOutOfBoundsException.class);
        
        assertThatThrownBy(() -> stringList.get(1))
            .isInstanceOf(IndexOutOfBoundsException.class);
    }
    
    @Test
    @DisplayName("Should remove items by index")
    void shouldRemoveItemsByIndex() {
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        
        String removed = stringList.remove(1);
        
        assertThat(removed).isEqualTo("B");
        assertThat(stringList.size()).isEqualTo(2);
        assertThat(stringList.get(0)).isEqualTo("A");
        assertThat(stringList.get(1)).isEqualTo("C");
    }
    
    @Test
    @DisplayName("Should check if list contains items")
    void shouldCheckContains() {
        stringList.add("Java");
        stringList.add("Python");
        
        assertThat(stringList.contains("Java")).isTrue();
        assertThat(stringList.contains("Python")).isTrue();
        assertThat(stringList.contains("C++")).isFalse();
    }
    
    @Test
    @DisplayName("Should find index of items")
    void shouldFindIndexOf() {
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");
        
        assertThat(stringList.indexOf("First")).isEqualTo(0);
        assertThat(stringList.indexOf("Second")).isEqualTo(1);
        assertThat(stringList.indexOf("Third")).isEqualTo(2);
        assertThat(stringList.indexOf("NotFound")).isEqualTo(-1);
    }
    
    @Test
    @DisplayName("Should clear all items")
    void shouldClearAllItems() {
        stringList.add("Item1");
        stringList.add("Item2");
        
        stringList.clear();
        
        assertThat(stringList.size()).isEqualTo(0);
        assertThat(stringList.isEmpty()).isTrue();
    }
    
    @Test
    @DisplayName("Should convert to array")
    void shouldConvertToArray() {
        intList.add(1);
        intList.add(2);
        intList.add(3);
        
        Object[] array = intList.toArray();
        
        assertThat(array).hasSize(3);
        assertThat(array[0]).isEqualTo(1);
        assertThat(array[1]).isEqualTo(2);
        assertThat(array[2]).isEqualTo(3);
    }
    
    @Test
    @DisplayName("Should handle null values")
    void shouldHandleNullValues() {
        stringList.add(null);
        stringList.add("NotNull");
        
        assertThat(stringList.size()).isEqualTo(2);
        assertThat(stringList.get(0)).isNull();
        assertThat(stringList.get(1)).isEqualTo("NotNull");
        assertThat(stringList.contains(null)).isTrue();
        assertThat(stringList.indexOf(null)).isEqualTo(0);
    }
}
