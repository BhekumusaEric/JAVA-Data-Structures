package com.learnjava;

import java.util.*;

/**
 * A demonstration class showing Java's built-in data structures and operations.
 * This class shows practical usage of Maps, Sets, and advanced collections.
 * 
 * Your task: Make all the unit tests pass by implementing the methods below!
 */
public class DataStructuresDemo {

    /**
     * Creates a frequency map of characters in a string
     * @param text the input string
     * @return a map where keys are characters and values are their frequencies
     */
    public Map<Character, Integer> getCharacterFrequency(String text) {
        // TODO: Implement this method
        // Hint: Use HashMap<Character, Integer> and iterate through string
        HashMap<Character , Integer> dict_obj = new HashMap<>();
        for (char ch : text.toCharArray()){
            System.out.println(ch + "   : " + dict_obj.getOrDefault(ch , 0));
            dict_obj.put(ch , dict_obj.getOrDefault(ch, 0) + 1);
        }
        System.out.println(dict_obj);
        return dict_obj;
    }
    
    /**
     * Creates a frequency map of words in a sentence
     * @param sentence the input sentence
     * @return a map where keys are words and values are their frequencies
     */
    public Map<String, Integer> getWordFrequency(String sentence) {
        // TODO: Implement this method
        // Hint: Split by spaces, use HashMap<String, Integer>
        HashMap<String , Integer > obj_dict = new HashMap<>();
        String[] sentence_splited = new ArrayList<>().toArray(new String[0]);
        StringBuilder new_sen = new StringBuilder(sentence);
        sentence_splited = sentence.split(" ");
        System.out.println(Arrays.toString(sentence_splited));
        for (String word : sentence_splited){
            System.out.println(word);
            obj_dict.put(word , obj_dict.getOrDefault(word , 0) + 1);
        }
        System.out.println(obj_dict);
        return obj_dict;
    }

    public static void main(String[] args) {
        DataStructuresDemo o = new DataStructuresDemo();
        //o.getCharacterFrequency("Ericei");
        //o.getWordFrequency("I am eric and Being eric is amazing");
        //o.getUniqueCharacters("Ericcciie");
        Map<String, String> studentGrades = new HashMap<>();
        studentGrades.put("Alice", "A");
        studentGrades.put("Bob", "B");
        studentGrades.put("Charlie", "A");
        studentGrades.put("David", "B");
        o.groupStudentsByGrade(studentGrades);
    }
    /**
     * Finds all unique characters in a string
     * @param text the input string
     * @return a set containing all unique characters
     */
    public Set<Character> getUniqueCharacters(String text) {
        // TODO: Implement this method
        // Hint: Use HashSet<Character>
        text = text.toLowerCase();
        HashSet<Character> uniqes = new HashSet<>();
        for(Character ch : text.toCharArray()){
            uniqes.add(ch);
        }
        System.out.println(uniqes);
        return uniqes;
    }
    
    /**
     * Groups students by their grades
     * @param studentGrades a map of student names to their grades
     * @return a map where keys are grades and values are lists of students with that grade
     */
    public Map<String, List<String>> groupStudentsByGrade(Map<String, String> studentGrades) {
        // TODO: Implement this method
        // Hint: Use HashMap<String, List<String>> and iterate through input map
        HashMap<String , List<String>> obj_dic = new HashMap<>();

        for (Map.Entry<String, String> entry : studentGrades.entrySet()){
            String grade = entry.getValue();
            String student = entry.getKey();
            obj_dic.putIfAbsent(entry.getValue(), new ArrayList<>());
            obj_dic.get(grade).add(student);
            System.out.println(entry.getValue());
        }
        return obj_dic;
    }
    
    /**
     * Finds the intersection of two sets (common elements)
     * @param set1 first set
     * @param set2 second set
     * @return a new set containing elements present in both sets
     */
    public Set<String> findIntersection(Set<String> set1, Set<String> set2) {
        // TODO: Implement this method
        // Hint: Create new HashSet and use retainAll() or manual iteration
        return null;
    }
    
    /**
     * Finds the union of two sets (all elements from both sets)
     * @param set1 first set
     * @param set2 second set
     * @return a new set containing all elements from both sets
     */
    public Set<String> findUnion(Set<String> set1, Set<String> set2) {
        // TODO: Implement this method
        // Hint: Create new HashSet and use addAll()
        return null;
    }
    
    /**
     * Sorts a map by its values in descending order
     * @param map the input map
     * @return a list of map entries sorted by value (highest first)
     */
    public List<Map.Entry<String, Integer>> sortMapByValue(Map<String, Integer> map) {
        // TODO: Implement this method
        // Hint: Convert to list of entries and use Collections.sort() with custom comparator
        return null;
    }
    
    /**
     * Creates a phone book (name -> phone number mapping)
     * @param names array of names
     * @param phones array of phone numbers (same order as names)
     * @return a map linking names to phone numbers
     */
    public Map<String, String> createPhoneBook(String[] names, String[] phones) {
        // TODO: Implement this method
        // Hint: Use HashMap and iterate through both arrays simultaneously
        return null;
    }
    
    /**
     * Finds the most frequent word in a text
     * @param text the input text
     * @return the most frequent word (case-insensitive)
     */
    public String findMostFrequentWord(String text) {
        // TODO: Implement this method
        // Hint: Use getWordFrequency() and find max value
        return null;
    }
    
    /**
     * Removes duplicates from a list while preserving order
     * @param list the input list
     * @return a new list with duplicates removed
     */
    public List<String> removeDuplicatesPreserveOrder(List<String> list) {
        // TODO: Implement this method
        // Hint: Use LinkedHashSet to preserve insertion order
        return null;
    }
    
    /**
     * Checks if two strings are anagrams using character frequency
     * @param str1 first string
     * @param str2 second string
     * @return true if strings are anagrams, false otherwise
     */
    public boolean areAnagramsUsingMap(String str1, String str2) {
        // TODO: Implement this method
        // Hint: Use getCharacterFrequency() for both strings and compare maps
        return false;
    }
    
    /**
     * Creates a simple cache with get and put operations
     * @param maxSize maximum size of the cache
     * @return a new cache map
     */
    public Map<String, String> createCache(int maxSize) {
        // TODO: Implement this method
        // Hint: Use LinkedHashMap with access order and override removeEldestEntry
        return new LinkedHashMap<String, String>(16, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > maxSize;
            }
        };
    }
}
