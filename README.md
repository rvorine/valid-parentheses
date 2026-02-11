# Valid Parentheses

[![YouTube](https://img.shields.io/badge/YouTube-@rvorine-red?style=for-the-badge&logo=youtube)](https://youtube.com/@rvorine)
[![Instagram](https://img.shields.io/badge/Instagram-lacopydepastel-E4405F?style=for-the-badge&logo=instagram)](https://instagram.com/lacopydepastel)

A multi-language implementation of the classic "Valid Parentheses" problem from LeetCode.

## 📝 Problem Statement

Given a string containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

### Examples

**Example 1:**
```
Input: s = "()"
Output: true
```

**Example 2:**
```
Input: s = "()[]{}"
Output: true
```

**Example 3:**
```
Input: s = "(]"
Output: false
```

**Example 4:**
```
Input: s = "([)]"
Output: false
```

**Example 5:**
```
Input: s = "{[]}"
Output: true
```

## 💡 Solution Approach

The problem is efficiently solved using a **Stack** data structure with the following approach:

1. **Iterate through the string**: Process each character one by one.
2. **Push opening brackets**: When encountering an opening bracket `(`, `{`, or `[`, push it onto the stack.
3. **Match closing brackets**: When encountering a closing bracket `)`, `}`, or `]`:
   - Check if the stack is empty (if yes, return false - no matching opening bracket)
   - Pop the top element from the stack
   - Verify if it matches the corresponding opening bracket
   - If it doesn't match, return false
4. **Check stack at the end**: After processing all characters, the stack should be empty for valid parentheses.

### Time & Space Complexity

- **Time Complexity**: O(n) - where n is the length of the string (single pass through the string)
- **Space Complexity**: O(n) - in the worst case, all characters could be opening brackets

## 🚀 Implementations

This repository contains implementations in multiple programming languages:

### Java
```bash
cd java
javac ValidParentheses.java
java ValidParentheses
```

### Kotlin
```bash
cd kotlin
kotlinc ValidParentheses.kt -include-runtime -d ValidParentheses.jar
java -jar ValidParentheses.jar
```

### C
```bash
cd c
gcc valid_parentheses.c -o valid_parentheses
./valid_parentheses
```

### C#
```bash
cd csharp
csc ValidParentheses.cs
mono ValidParentheses.exe  # On Linux/Mac
# Or
ValidParentheses.exe       # On Windows
```

### Python
```bash
cd python
python valid_parentheses.py
# Or
python3 valid_parentheses.py
```

### JavaScript
```bash
cd javascript
node validParentheses.js
```

## 📂 Project Structure

```
valid-parentheses/
├── java/
│   └── ValidParentheses.java
├── kotlin/
│   └── ValidParentheses.kt
├── c/
│   └── valid_parentheses.c
├── csharp/
│   └── ValidParentheses.cs
├── python/
│   └── valid_parentheses.py
├── javascript/
│   └── validParentheses.js
└── README.md
```

## ✨ Features

- ✅ Complete implementations in 6 different programming languages
- ✅ Well-documented code with comments
- ✅ Built-in test cases for verification
- ✅ Consistent algorithm across all implementations
- ✅ Clean and readable code

## 🤝 Connect with Me

- 🎥 YouTube: [@rvorine](https://youtube.com/@rvorine)
- 📸 Instagram: [lacopydepastel](https://instagram.com/lacopydepastel)

## 📄 License

This project is open source and available for educational purposes.

---

⭐ If you found this helpful, please star the repository and follow me on social media! 
