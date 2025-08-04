# Java Data Structures Learning Project

Welcome to your Java learning journey! This Maven project is designed to help you learn Java data structures and process flow through Test-Driven Development (TDD).

## 🎯 Learning Objectives

- Understand Java syntax and object-oriented programming
- Learn fundamental data structures (ArrayList, Stack)
- Practice control flow (loops, conditionals, recursion)
- Master exception handling
- Get comfortable with unit testing in Java

## 📁 Project Structure

```
src/
├── main/java/com/learnjava/
│   ├── Main.java                # Your original code (moved here)
│   ├── MyArrayList.java         # Custom ArrayList implementation
│   ├── MyStack.java             # Custom Stack implementation
│   ├── Calculator.java          # Calculator with math algorithms
│   ├── StringAlgorithms.java    # Classic string algorithms
│   └── DataStructuresDemo.java  # Maps, Sets, and advanced collections
└── test/java/com/learnjava/
    ├── MyArrayListTest.java       # Tests for MyArrayList (12 tests)
    ├── MyStackTest.java           # Tests for MyStack (10 tests)
    ├── CalculatorTest.java        # Tests for Calculator (19 tests)
    ├── StringAlgorithmsTest.java  # Tests for StringAlgorithms (13 tests)
    └── DataStructuresDemoTest.java # Tests for DataStructuresDemo (12 tests)
```

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher

### Running Tests

1. **Run all tests:**
   ```bash
   mvn test
   ```

2. **Run a specific test class:**
   ```bash
   mvn test -Dtest=MyArrayListTest
   mvn test -Dtest=MyStackTest
   mvn test -Dtest=CalculatorTest
   ```

3. **Run a specific test method:**
   ```bash
   mvn test -Dtest=CalculatorTest#shouldAddTwoNumbers
   ```

## 📚 Learning Path

### Phase 1: MyArrayList (Data Structure Basics)
Start with `MyArrayList.java` - implement the methods to make all tests in `MyArrayListTest.java` pass.

**Key Concepts:**
- Generics (`<T>`)
- ArrayList operations
- Exception handling
- Method implementation

### Phase 2: MyStack (LIFO Data Structure)
Move to `MyStack.java` - implement stack operations to make `MyStackTest.java` pass.

**Key Concepts:**
- Stack (LIFO - Last In, First Out)
- Exception handling for edge cases
- Search algorithms

### Phase 3: Calculator (Math Algorithms)
Implement `Calculator.java` to make `CalculatorTest.java` pass.

**Key Concepts:**
- Basic arithmetic operations
- Recursion (factorial, GCD)
- Iteration (Fibonacci)
- List processing (max, average)
- Prime number checking
- Perfect numbers
- Number base conversion
- Array algorithms

### Phase 4: StringAlgorithms (Classic String Problems)
Implement `StringAlgorithms.java` to make `StringAlgorithmsTest.java` pass.

**Key Concepts:**
- Palindrome checking
- Anagram detection
- String reversal
- Character frequency counting
- String compression
- Pattern matching

### Phase 5: DataStructuresDemo (Maps & Sets)
Finally, implement `DataStructuresDemo.java` to make `DataStructuresDemoTest.java` pass.

**Key Concepts:**
- HashMap operations (Java's dictionary)
- HashSet operations (unique collections)
- Character/word frequency counting
- Set operations (union, intersection)
- Map sorting and grouping
- Cache implementation

## 🔍 Key Java Concepts You'll Learn

### 1. Generics
```java
public class MyArrayList<T> {
    // T can be any type: String, Integer, etc.
}
```

### 2. Exception Handling
```java
if (condition) {
    throw new IllegalArgumentException("Error message");
}
```

### 3. Enhanced For Loop (For-Each)
```java
for (Type item : collection) {
    // Process each item
}
```

### 4. Recursion
```java
public long factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
```

## 🧪 Test-Driven Development (TDD)

This project follows TDD principles:
1. **Red**: Tests fail initially (methods return default values)
2. **Green**: Implement methods to make tests pass
3. **Refactor**: Improve your code while keeping tests green

## 💡 Tips for Success

1. **Start Small**: Implement one method at a time
2. **Read Test Names**: They tell you exactly what to implement
3. **Use IDE**: IntelliJ IDEA or VS Code with Java extensions
4. **Debug**: Use breakpoints to understand how your code works
5. **Ask Questions**: Don't hesitate to ask for help!

## 🏃‍♂️ Quick Start Commands

```bash
# Compile the project
mvn compile

# Run tests and see what fails
mvn test

# Run tests with more verbose output
mvn test -Dtest=MyArrayListTest -DforkCount=0

# Clean and compile
mvn clean compile
```

## 🎉 Success Criteria

You'll know you're successful when:
- All tests pass (`mvn test` shows green)
- You understand each method you implemented
- You can explain the difference between ArrayList and Stack
- You can write your own simple tests

## 📖 Next Steps

After completing this project:
1. Try implementing other data structures (LinkedList, Queue, HashMap)
2. Learn about Java Collections Framework
3. Explore more advanced topics (Streams, Lambda expressions)
4. Build a small application using what you've learned

Happy coding! 🚀
