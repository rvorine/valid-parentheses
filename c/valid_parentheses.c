#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

/**
 * Valid Parentheses Solution
 * 
 * Problem: Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * 
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 */

/**
 * Check if the given string has valid parentheses
 * 
 * @param s The string to check
 * @return true if parentheses are valid, false otherwise
 */
bool isValid(char* s) {
    if (s == NULL) {
        return true;
    }
    
    int len = strlen(s);
    if (len % 2 != 0) {
        return false;
    }
    
    // Create a stack using array
    char* stack = (char*)malloc(len * sizeof(char));
    int top = -1;
    
    for (int i = 0; i < len; i++) {
        char c = s[i];
        
        if (c == '(' || c == '{' || c == '[') {
            stack[++top] = c;
        } else {
            if (top == -1) {
                free(stack);
                return false;
            }
            
            char topChar = stack[top--];
            if ((c == ')' && topChar != '(') ||
                (c == '}' && topChar != '{') ||
                (c == ']' && topChar != '[')) {
                free(stack);
                return false;
            }
        }
    }
    
    bool result = (top == -1);
    free(stack);
    return result;
}

/**
 * Main function for testing
 */
int main() {
    // Test cases
    char* testCases[] = {"()", "()[]{}", "(]", "([)]", "{[]}", ""};
    bool expected[] = {true, true, false, false, true, true};
    int numTests = 6;
    
    printf("Valid Parentheses - C Implementation\n");
    printf("=====================================\n\n");
    
    for (int i = 0; i < numTests; i++) {
        bool result = isValid(testCases[i]);
        char* status = (result == expected[i]) ? "✓" : "✗";
        printf("%s Test: \"%s\" => %s (Expected: %s)\n", 
            status, testCases[i], result ? "true" : "false", 
            expected[i] ? "true" : "false");
    }
    
    return 0;
}
