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
// ArrayList<T> operations
items.add(item);                    // Add to end
items.add(index, item);             // Insert at index
items.get(index);                   // Get by index
items.set(index, item);             // Replace at index
items.remove(index);                // Remove by index
items.remove(item);                 // Remove first occurrence
items.contains(item);               // Check if contains
items.indexOf(item);                // Find first index
items.lastIndexOf(item);            // Find last index
items.size();                       // Get size
items.isEmpty();                    // Check if empty
items.clear();                      // Clear all
items.toArray();                    // Convert to array
items.subList(start, end);          // Get sublist
```

### String Operations (Java's String is Immutable!)
```java
// String creation and basic ops
String str = "Hello World";
String str2 = new String("Hello");

// Length and character access
str.length();                       // Get length
str.charAt(index);                  // Get character at index
str.toCharArray();                  // Convert to char array

// Case operations
str.toLowerCase();                  // Convert to lowercase
str.toUpperCase();                  // Convert to uppercase

// Searching and checking
str.contains("Hello");              // Check if contains substring
str.startsWith("He");               // Check if starts with
str.endsWith("ld");                 // Check if ends with
str.indexOf("o");                   // Find first occurrence
str.lastIndexOf("o");               // Find last occurrence
str.isEmpty();                      // Check if empty
str.isBlank();                      // Check if blank (Java 11+)

// Substring operations
str.substring(start);               // Substring from start to end
str.substring(start, end);          // Substring from start to end-1

// Splitting and joining
str.split(" ");                     // Split by delimiter
String.join(", ", array);          // Join array with delimiter

// Trimming and replacing
str.trim();                         // Remove leading/trailing spaces
str.strip();                        // Remove whitespace (Java 11+)
str.replace("old", "new");          // Replace all occurrences
str.replaceFirst("old", "new");     // Replace first occurrence

// Comparison
str.equals(other);                  // Content equality
str.equalsIgnoreCase(other);        // Case-insensitive equality
str.compareTo(other);               // Lexicographic comparison
```

### StringBuilder (Mutable String Alternative)
```java
// StringBuilder for efficient string building
StringBuilder sb = new StringBuilder();
sb.append("Hello");                 // Append string
sb.append(' ');                     // Append character
sb.insert(index, "text");           // Insert at index
sb.delete(start, end);              // Delete range
sb.reverse();                       // Reverse the string
sb.toString();                      // Convert to String
```

### Maps (Java's Dictionary Equivalent)
```java
// HashMap<K, V> operations (like Python dict)
Map<String, Integer> map = new HashMap<>();

// Adding and updating
map.put("key", value);              // Add/update key-value pair
map.putIfAbsent("key", value);      // Add only if key doesn't exist

// Retrieving
map.get("key");                     // Get value (returns null if not found)
map.getOrDefault("key", defaultVal); // Get value or default

// Checking
map.containsKey("key");             // Check if key exists
map.containsValue(value);           // Check if value exists
map.isEmpty();                      // Check if empty
map.size();                         // Get size

// Removing
map.remove("key");                  // Remove by key
map.clear();                        // Clear all

// Iteration
for (String key : map.keySet()) {   // Iterate over keys
    // process key
}
for (Integer value : map.values()) { // Iterate over values
    // process value
}
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    String key = entry.getKey();
    Integer value = entry.getValue();
}

// Other Map types
TreeMap<String, Integer> sortedMap = new TreeMap<>();  // Sorted by keys
LinkedHashMap<String, Integer> orderedMap = new LinkedHashMap<>(); // Insertion order
```

### Exception Throwing
```java
throw new IllegalArgumentException("Error message");
```

## 📚 Essential Java Libraries & Classes

### Core Java Packages (java.*)

#### java.lang (Automatically imported)
```java
// Fundamental classes
String, StringBuilder, StringBuffer    // String manipulation
Integer, Double, Long, Boolean        // Wrapper classes for primitives
Math                                  // Mathematical operations
System                               // System operations (System.out.println)
Object                               // Base class for all objects
Class                                // Reflection operations
Thread                               // Threading support
Exception, RuntimeException          // Exception handling
```

#### java.util (Collections & Utilities)
```java
// Collections Framework
List<T>, ArrayList<T>, LinkedList<T>  // Dynamic arrays and linked lists
Set<T>, HashSet<T>, TreeSet<T>       // Sets (unique elements)
Map<K,V>, HashMap<K,V>, TreeMap<K,V> // Key-value mappings
Queue<T>, PriorityQueue<T>           // Queue implementations
Stack<T>                             // LIFO stack

// Utilities
Collections                          // Utility methods for collections
Arrays                              // Utility methods for arrays
Scanner                             // Input reading
Random                              // Random number generation
Date, Calendar                      // Date/time (legacy)
Timer, TimerTask                    // Scheduling tasks
```

#### java.time (Modern Date/Time API - Java 8+)
```java
LocalDate                           // Date without time
LocalTime                           // Time without date
LocalDateTime                       // Date and time
ZonedDateTime                       // Date/time with timezone
Instant                             // Point in time
Duration                            // Time-based amount
Period                              // Date-based amount
DateTimeFormatter                   // Formatting dates/times
```

#### java.io (Input/Output)
```java
File                                // File and directory operations
FileReader, FileWriter              // Character-based file I/O
BufferedReader, BufferedWriter      // Buffered I/O for efficiency
FileInputStream, FileOutputStream   // Byte-based file I/O
PrintWriter                         // Formatted text output
Scanner                             // Parsing input
```

#### java.nio (New I/O - More efficient)
```java
Path, Paths                         // Modern file path handling
Files                               // File operations utility
ByteBuffer                          // Efficient byte operations
```

### Important Third-Party Libraries

#### Testing
```java
// JUnit 5 (Jupiter)
@Test, @BeforeEach, @AfterEach      // Test annotations
Assertions.assertEquals()           // Test assertions

// AssertJ (Fluent assertions)
assertThat(actual).isEqualTo(expected);
```

#### JSON Processing
```java
// Jackson (Popular JSON library)
ObjectMapper mapper = new ObjectMapper();
String json = mapper.writeValueAsString(object);
MyClass obj = mapper.readValue(json, MyClass.class);

// Gson (Google's JSON library)
Gson gson = new Gson();
String json = gson.toJson(object);
MyClass obj = gson.fromJson(json, MyClass.class);
```

#### HTTP Clients
```java
// Java 11+ built-in HTTP Client
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("https://api.example.com"))
    .build();
```

## 🔧 Common Patterns You'll Use

### Exception Handling
```java
try {
    // risky code
} catch (SpecificException e) {
    // handle specific exception
} catch (Exception e) {
    // handle general exception
} finally {
    // cleanup code (always runs)
}
```

### Enhanced For Loops (For-Each)
```java
// For collections
for (String item : stringList) {
    System.out.println(item);
}

// For arrays
for (int num : intArray) {
    System.out.println(num);
}

// For Map entries
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

### Lambda Expressions (Java 8+)
```java
// Functional programming style
list.forEach(item -> System.out.println(item));
list.stream()
    .filter(s -> s.length() > 3)
    .map(String::toUpperCase)
    .collect(Collectors.toList());
```

### Streams API (Java 8+)
```java
// Powerful data processing
List<String> result = list.stream()
    .filter(s -> s.startsWith("A"))     // Filter elements
    .map(String::toLowerCase)           // Transform elements
    .sorted()                           // Sort elements
    .collect(Collectors.toList());      // Collect to list

// Useful stream operations
.count()                                // Count elements
.findFirst()                            // Get first element
.anyMatch(predicate)                    // Check if any match
.allMatch(predicate)                    // Check if all match
.reduce(identity, accumulator)          // Reduce to single value
```

## 🎯 Java vs Python Quick Reference

| Operation | Python | Java |
|-----------|--------|------|
| **Lists** | `list = []` | `List<T> list = new ArrayList<>();` |
| **Dictionaries** | `dict = {}` | `Map<K,V> map = new HashMap<>();` |
| **String formatting** | `f"Hello {name}"` | `String.format("Hello %s", name)` |
| **Length** | `len(obj)` | `obj.size()` or `obj.length()` |
| **Iteration** | `for item in items:` | `for (Type item : items) {` |
| **List comprehension** | `[x*2 for x in nums]` | `nums.stream().map(x -> x*2).collect(toList())` |
| **Exception** | `except Exception as e:` | `catch (Exception e) {` |

Happy coding! Remember, every expert was once a beginner. You've got this! 🚀
