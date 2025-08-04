package com.learnjava;

import java.util.ArrayList;
import java.util.List;

/**
 * A custom ArrayList implementation to practice Java data structures.
 * This class wraps ArrayList and adds some custom functionality.
 * 
 * Your task: Make all the unit tests pass by implementing the methods below!
 */
public class MyArrayList<T> {
    private List<T> items;
    
    public MyArrayList() {
        // TODO: Initialize the items list
    }
    
    /**
     * Adds an item to the end of the list
     * @param item the item to add
     */
    public void add(T item) {
        // TODO: Implement this method
    }
    
    /**
     * Gets an item at the specified index
     * @param index the index to get
     * @return the item at the index
     * @throws IndexOutOfBoundsException if index is invalid
     */
    public T get(int index) {
        // TODO: Implement this method
        return null;
    }
    
    /**
     * Returns the size of the list
     * @return the number of items in the list
     */
    public int size() {
        // TODO: Implement this method
        return 0;
    }
    
    /**
     * Removes an item at the specified index
     * @param index the index to remove
     * @return the removed item
     * @throws IndexOutOfBoundsException if index is invalid
     */
    public T remove(int index) {
        // TODO: Implement this method
        return null;
    }
    
    /**
     * Checks if the list contains a specific item
     * @param item the item to search for
     * @return true if the item is found, false otherwise
     */
    public boolean contains(T item) {
        // TODO: Implement this method
        return false;
    }
    
    /**
     * Finds the index of the first occurrence of an item
     * @param item the item to search for
     * @return the index of the item, or -1 if not found
     */
    public int indexOf(T item) {
        // TODO: Implement this method
        return -1;
    }
    
    /**
     * Checks if the list is empty
     * @return true if the list has no items, false otherwise
     */
    public boolean isEmpty() {
        // TODO: Implement this method
        return false;
    }
    
    /**
     * Clears all items from the list
     */
    public void clear() {
        // TODO: Implement this method
    }
    
    /**
     * Converts the list to an array
     * @return an array containing all items in the list
     */
    public Object[] toArray() {
        // TODO: Implement this method
        return null;
    }
}
