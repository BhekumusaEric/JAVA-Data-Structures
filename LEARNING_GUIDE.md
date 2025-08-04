# Java Learning Guide - From Python to Java

Welcome! This guide will help you transition from Python to Java by highlighting key differences and similarities.

## 🐍 ➡️ ☕ Key Differences from Python

### 1. Static Typing vs Dynamic Typing

**Python:**
```python
name = "John"        # Type inferred
age = 25            # Type inferred
numbers = [1, 2, 3] # Type inferred
```

**Java:**
```java
String name = "John";           // Must declare type
int age = 25;                   // Must declare type
List<Integer> numbers = new ArrayList<>(); // Must declare type and instantiate
```

### 2. Compilation vs Interpretation

- **Python**: Interpreted (run directly)
- **Java**: Compiled (javac → .class files → JVM)

### 3. Object Creation

**Python:**
```python
my_list = []  # Simple creation
```

**Java:**
```java
List<String> myList = new ArrayList<>();  // Must use 'new' keyword
```

### 4. Method Definitions

**Python:**
```python
def add_numbers(a, b):
    return a + b
```

**Java:**
```java
public int addNumbers(int a, int b) {
    return a + b;
}
```

## 🎯 Your Learning Tasks

### Phase 1: MyArrayList (Start Here!)

1. **Initialize the constructor:**
   ```java
   public MyArrayList() {
       this.items = new ArrayList<>();  // Create new ArrayList
   }
   ```

2. **Implement add() method:**
   ```java
   public void add(T item) {
       items.add(item);  // Use ArrayList's add method
   }
   ```

3. **Implement size() method:**
   ```java
   public int size() {
       return items.size();  // Use ArrayList's size method
   }
   ```

### Key Java Concepts You'll Learn:

#### Generics (`<T>`)
- `T` is a placeholder for any type
- Like Python's type hints but enforced at compile time
- `MyArrayList<String>` means it only holds Strings

#### Exception Handling
```java
if (index < 0 || index >= items.size()) {
    throw new IndexOutOfBoundsException("Index: " + index);
}
```

#### Enhanced For Loop (like Python's for-in)
```java
// Java enhanced for loop
for (T item : items) {
    // process item
}

# Python equivalent
for item in items:
    # process item
```

## 🔧 Development Workflow

1. **Run tests to see what fails:**
   ```bash
   mvn test -Dtest=MyArrayListTest
   ```

2. **Implement one method at a time**

3. **Run tests again to see progress:**
   ```bash
   mvn test -Dtest=MyArrayListTest#shouldAddItems
   ```

4. **Repeat until all tests pass**

## 💡 Java Tips for Python Developers

### 1. Semicolons are Required
Every statement must end with `;`

### 2. Curly Braces for Blocks
```java
if (condition) {
    // code here
}
```

### 3. Method Naming Convention
- Java: `camelCase` (e.g., `addItem`)
- Python: `snake_case` (e.g., `add_item`)

### 4. Access Modifiers
- `public`: accessible everywhere
- `private`: only within the same class
- `protected`: within package and subclasses

### 5. Null vs None
- Java: `null`
- Python: `None`

## 🚀 Quick Start Commands

```bash
# Run all tests (see everything that needs to be implemented)
mvn test

# Run specific test class
mvn test -Dtest=MyArrayListTest

# Run specific test method
mvn test -Dtest=MyArrayListTest#shouldAddItems

# Compile only
mvn compile

# Clean and compile
mvn clean compile
```

## 📚 Learning Order

1. **MyArrayList** - Basic data structure operations
2. **MyStack** - LIFO operations and exception handling
3. **Calculator** - Algorithms, recursion, and iteration

## 🎉 Success Tips

1. **Start Small**: Implement one method, run tests, see it pass
2. **Read Error Messages**: Java compiler errors are very helpful
3. **Use IDE**: IntelliJ IDEA or VS Code with Java extensions
4. **Don't Rush**: Understanding is more important than speed
5. **Ask Questions**: When stuck, ask for help!

## 🔍 Common Java Patterns You'll Use

### Null Checking
```java
if (item == null) {
    // handle null case
}
```

### List Operations
```java
items.add(item);           // Add to end
items.get(index);          // Get by index
items.remove(index);       // Remove by index
items.contains(item);      // Check if contains
items.indexOf(item);       // Find index
items.clear();             // Clear all
```

### Exception Throwing
```java
throw new IllegalArgumentException("Error message");
```

Happy coding! Remember, every expert was once a beginner. You've got this! 🚀
