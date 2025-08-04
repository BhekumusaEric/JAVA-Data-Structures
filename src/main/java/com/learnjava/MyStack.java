package com.learnjava;

import java.util.ArrayList;
import java.util.List;

/**
 * A custom Stack implementation using ArrayList.
 * Stack follows LIFO (Last In, First Out) principle.
 * 
 * Your task: Make all the unit tests pass by implementing the methods below!
 */
public class MyStack<T> {
    private List<T> items;
    
    public MyStack() {
        // TODO: Initialize the items list
    }
    
    /**
     * Pushes an item onto the top of the stack
     * @param item the item to push
     */
    public void push(T item) {
        // TODO: Implement this method
    }
    
    /**
     * Removes and returns the top item from the stack
     * @return the top item
     * @throws RuntimeException if the stack is empty
     */
    public T pop() {
        // TODO: Implement this method
        return null;
    }
    
    /**
     * Returns the top item without removing it
     * @return the top item
     * @throws RuntimeException if the stack is empty
     */
    public T peek() {
        // TODO: Implement this method
        return null;
    }
    
    /**
     * Checks if the stack is empty
     * @return true if the stack has no items, false otherwise
     */
    public boolean isEmpty() {
        // TODO: Implement this method
        return false;
    }
    
    /**
     * Returns the number of items in the stack
     * @return the size of the stack
     */
    public int size() {
        // TODO: Implement this method
        return 0;
    }
    
    /**
     * Searches for an item in the stack
     * @param item the item to search for
     * @return the 1-based position from the top of the stack, or -1 if not found
     */
    public int search(T item) {
        // TODO: Implement this method
        // Hint: Position 1 means the top of the stack
        return -1;
    }
}
