# 🌿 Git Branching Guide for Java Learning Project

This guide explains how to use Git branches effectively for learning and collaboration.

## 🎯 Branch Structure

### 📚 **template-for-peers** (Clean Template)
- **Purpose**: Share with other learners
- **Status**: All methods are empty (TODO comments)
- **Tests**: 66 tests (all failing - perfect for TDD!)
- **Use**: Clone this branch to start fresh

### 🚀 **my-solutions** (Your Practice Branch)
- **Purpose**: Your personal implementation work
- **Status**: Where you implement solutions
- **Use**: Your playground to learn and experiment

### 🌟 **main** (Project Base)
- **Purpose**: Main project branch
- **Status**: Same as template currently
- **Use**: Base for creating new branches

## 🔄 How to Use This Setup

### For You (Project Owner):
```bash
# Work on your solutions
git checkout my-solutions
# Implement methods, run tests, commit progress
git add .
git commit -m "Implement MyArrayList.add() method"

# Switch back to template to share with peers
git checkout template-for-peers
# This branch always stays clean for sharing
```

### For Your Peers:
```bash
# Clone the repository
git clone https://github.com/BhekumusaEric/JAVA-Data-Structures.git
cd JAVA-Data-Structures

# Start with the clean template
git checkout template-for-peers

# Create their own practice branch
git checkout -b [their-name]-solutions
# Example: git checkout -b alice-solutions

# Now they can implement and practice!
```

## 🎓 Learning Workflow for Everyone

### Step 1: Start Fresh
```bash
git checkout template-for-peers
git checkout -b your-name-solutions
```

### Step 2: Pick a Class to Implement
```bash
# See all failing tests
mvn test

# Start with MyArrayList (easiest)
mvn test -Dtest=MyArrayListTest
```

### Step 3: Implement One Method at a Time
```bash
# Edit src/main/java/com/learnjava/MyArrayList.java
# Implement one method (e.g., add())

# Run specific test
mvn test -Dtest=MyArrayListTest#shouldAddItems

# Commit when test passes
git add .
git commit -m "✅ Implement MyArrayList.add() - 1 test passing!"
```

### Step 4: Track Progress
```bash
# See overall progress
mvn test | grep "Tests run"

# Commit major milestones
git commit -m "🎉 MyArrayList complete - 12/12 tests passing!"
```

## 📊 Project Statistics

- **Total Tests**: 66
- **Classes to Implement**: 5
- **Methods to Complete**: 51
- **Classic Algorithms**: 20+

### Test Breakdown:
- `MyArrayListTest`: 12 tests (Data structures basics)
- `MyStackTest`: 10 tests (LIFO operations)
- `CalculatorTest`: 19 tests (Math algorithms)
- `StringAlgorithmsTest`: 13 tests (String problems)
- `DataStructuresDemoTest`: 12 tests (Maps & Sets)

## 🎯 Recommended Learning Order

1. **MyArrayList** → Basic data structure operations
2. **MyStack** → LIFO operations and exception handling
3. **Calculator** → Math algorithms (fibonacci, factorial, primes)
4. **StringAlgorithms** → String problems (palindrome, anagrams)
5. **DataStructuresDemo** → Maps, Sets, and advanced collections

## 🤝 Collaboration Tips

### Sharing Progress
```bash
# Push your solutions (optional)
git push -u origin your-name-solutions

# Share specific implementations
git show HEAD  # Show last commit
```

### Getting Updates
```bash
# If template gets updated
git checkout template-for-peers
git pull origin template-for-peers

# Merge updates into your branch
git checkout your-name-solutions
git merge template-for-peers
```

### Code Reviews
```bash
# Compare your solution with template
git diff template-for-peers..your-name-solutions

# See what you've implemented
git log --oneline template-for-peers..your-name-solutions
```

## 🏆 Success Milestones

- [ ] **Beginner**: MyArrayList complete (12/12 tests)
- [ ] **Intermediate**: MyStack + Calculator complete (41/66 tests)
- [ ] **Advanced**: All string algorithms complete (54/66 tests)
- [ ] **Expert**: All tests passing (66/66 tests) 🎉

## 🚀 Quick Commands Reference

```bash
# See current branch
git branch

# Switch branches
git checkout branch-name

# Create new branch
git checkout -b new-branch-name

# See all branches
git branch -a

# Run tests
mvn test                              # All tests
mvn test -Dtest=ClassName            # Specific class
mvn test -Dtest=ClassName#methodName # Specific test

# Commit progress
git add .
git commit -m "Your message"
```

## 🎉 Happy Learning!

This setup gives you:
- ✅ Clean template for sharing
- ✅ Personal practice space
- ✅ Progress tracking with Git
- ✅ Collaboration-ready structure
- ✅ Professional development workflow

Start coding and have fun mastering Java! 🚀
