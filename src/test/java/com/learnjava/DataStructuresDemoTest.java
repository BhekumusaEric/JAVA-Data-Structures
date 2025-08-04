package com.learnjava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.*;

import java.util.*;

/**
 * Unit tests for DataStructuresDemo class.
 * These tests demonstrate Java's Map, Set, and List operations!
 * 
 * To run tests: mvn test
 * To run only this test class: mvn test -Dtest=DataStructuresDemoTest
 */
@DisplayName("Data Structures Demo Tests")
public class DataStructuresDemoTest {
    
    private DataStructuresDemo demo;
    
    @BeforeEach
    void setUp() {
        demo = new DataStructuresDemo();
    }
    
    @Test
    @DisplayName("Should get character frequency correctly")
    void shouldGetCharacterFrequency() {
        Map<Character, Integer> result = demo.getCharacterFrequency("hello");
        
        assertThat(result).hasSize(4);
        assertThat(result.get('h')).isEqualTo(1);
        assertThat(result.get('e')).isEqualTo(1);
        assertThat(result.get('l')).isEqualTo(2);
        assertThat(result.get('o')).isEqualTo(1);
        
        // Test empty string
        assertThat(demo.getCharacterFrequency("")).isEmpty();
    }
    
    @Test
    @DisplayName("Should get word frequency correctly")
    void shouldGetWordFrequency() {
        Map<String, Integer> result = demo.getWordFrequency("hello world hello");
        
        assertThat(result).hasSize(2);
        assertThat(result.get("hello")).isEqualTo(2);
        assertThat(result.get("world")).isEqualTo(1);
        
        // Test single word
        Map<String, Integer> single = demo.getWordFrequency("java");
        assertThat(single).hasSize(1);
        assertThat(single.get("java")).isEqualTo(1);
    }
    
    @Test
    @DisplayName("Should get unique characters correctly")
    void shouldGetUniqueCharacters() {
        Set<Character> result = demo.getUniqueCharacters("hello");
        
        assertThat(result).hasSize(4);
        assertThat(result).contains('h', 'e', 'l', 'o');
        
        // Test with duplicates
        Set<Character> duplicates = demo.getUniqueCharacters("aabbcc");
        assertThat(duplicates).hasSize(3);
        assertThat(duplicates).contains('a', 'b', 'c');
    }
    
    @Test
    @DisplayName("Should group students by grade correctly")
    void shouldGroupStudentsByGrade() {
        Map<String, String> studentGrades = new HashMap<>();
        studentGrades.put("Alice", "A");
        studentGrades.put("Bob", "B");
        studentGrades.put("Charlie", "A");
        studentGrades.put("David", "B");
        
        Map<String, List<String>> result = demo.groupStudentsByGrade(studentGrades);
        
        assertThat(result).hasSize(2);
        assertThat(result.get("A")).containsExactlyInAnyOrder("Alice", "Charlie");
        assertThat(result.get("B")).containsExactlyInAnyOrder("Bob", "David");
    }
    
    @Test
    @DisplayName("Should find intersection of sets correctly")
    void shouldFindIntersection() {
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
        
        Set<String> result = demo.findIntersection(set1, set2);
        
        assertThat(result).hasSize(2);
        assertThat(result).contains("b", "c");
        
        // Test no intersection
        Set<String> set3 = new HashSet<>(Arrays.asList("x", "y", "z"));
        Set<String> noIntersection = demo.findIntersection(set1, set3);
        assertThat(noIntersection).isEmpty();
    }
    
    @Test
    @DisplayName("Should find union of sets correctly")
    void shouldFindUnion() {
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c"));
        
        Set<String> result = demo.findUnion(set1, set2);
        
        assertThat(result).hasSize(3);
        assertThat(result).contains("a", "b", "c");
    }
    
    @Test
    @DisplayName("Should sort map by value correctly")
    void shouldSortMapByValue() {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 5);
        map.put("banana", 2);
        map.put("cherry", 8);
        
        List<Map.Entry<String, Integer>> result = demo.sortMapByValue(map);
        
        assertThat(result).hasSize(3);
        assertThat(result.get(0).getKey()).isEqualTo("cherry");
        assertThat(result.get(0).getValue()).isEqualTo(8);
        assertThat(result.get(1).getKey()).isEqualTo("apple");
        assertThat(result.get(1).getValue()).isEqualTo(5);
        assertThat(result.get(2).getKey()).isEqualTo("banana");
        assertThat(result.get(2).getValue()).isEqualTo(2);
    }
    
    @Test
    @DisplayName("Should create phone book correctly")
    void shouldCreatePhoneBook() {
        String[] names = {"Alice", "Bob", "Charlie"};
        String[] phones = {"123-456", "789-012", "345-678"};
        
        Map<String, String> result = demo.createPhoneBook(names, phones);
        
        assertThat(result).hasSize(3);
        assertThat(result.get("Alice")).isEqualTo("123-456");
        assertThat(result.get("Bob")).isEqualTo("789-012");
        assertThat(result.get("Charlie")).isEqualTo("345-678");
    }
    
    @Test
    @DisplayName("Should find most frequent word correctly")
    void shouldFindMostFrequentWord() {
        String result = demo.findMostFrequentWord("hello world hello java world hello");
        assertThat(result).isEqualTo("hello");
        
        // Test case insensitive
        String caseResult = demo.findMostFrequentWord("Java java JAVA programming");
        assertThat(caseResult.toLowerCase()).isEqualTo("java");
    }
    
    @Test
    @DisplayName("Should remove duplicates while preserving order")
    void shouldRemoveDuplicatesPreserveOrder() {
        List<String> input = Arrays.asList("a", "b", "a", "c", "b", "d");
        List<String> result = demo.removeDuplicatesPreserveOrder(input);
        
        assertThat(result).hasSize(4);
        assertThat(result).containsExactly("a", "b", "c", "d");
    }
    
    @Test
    @DisplayName("Should check anagrams using map correctly")
    void shouldCheckAnagramsUsingMap() {
        assertThat(demo.areAnagramsUsingMap("listen", "silent")).isTrue();
        assertThat(demo.areAnagramsUsingMap("evil", "vile")).isTrue();
        assertThat(demo.areAnagramsUsingMap("hello", "world")).isFalse();
        assertThat(demo.areAnagramsUsingMap("", "")).isTrue();
    }
    
    @Test
    @DisplayName("Should create cache with size limit")
    void shouldCreateCacheWithSizeLimit() {
        Map<String, String> cache = demo.createCache(2);
        
        cache.put("key1", "value1");
        cache.put("key2", "value2");
        assertThat(cache).hasSize(2);
        
        // Adding third item should remove oldest
        cache.put("key3", "value3");
        assertThat(cache).hasSize(2);
        assertThat(cache).doesNotContainKey("key1");
        assertThat(cache).containsKeys("key2", "key3");
    }
}
