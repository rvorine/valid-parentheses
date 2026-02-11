using System;
using System.Collections.Generic;

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
public class ValidParentheses
{
    /**
     * Check if the given string has valid parentheses
     * 
     * @param s The string to check
     * @return true if parentheses are valid, false otherwise
     */
    public bool IsValid(string s)
    {
        if (s == null || s.Length % 2 != 0)
        {
            return false;
        }
        
        Stack<char> stack = new Stack<char>();
        
        foreach (char c in s)
        {
            if (c == '(' || c == '{' || c == '[')
            {
                stack.Push(c);
            }
            else
            {
                if (stack.Count == 0)
                {
                    return false;
                }
                
                char top = stack.Pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '['))
                {
                    return false;
                }
            }
        }
        
        return stack.Count == 0;
    }
    
    /**
     * Main method for testing
     */
    public static void Main(string[] args)
    {
        ValidParentheses solution = new ValidParentheses();
        
        // Test cases
        string[] testCases = { "()", "()[]{}", "(]", "([)]", "{[]}", "" };
        bool[] expected = { true, true, false, false, true, true };
        
        Console.WriteLine("Valid Parentheses - C# Implementation");
        Console.WriteLine("======================================\n");
        
        for (int i = 0; i < testCases.Length; i++)
        {
            string test = testCases[i];
            bool result = solution.IsValid(test);
            string status = (result == expected[i]) ? "✓" : "✗";
            Console.WriteLine($"{status} Test: \"{test}\" => {result} (Expected: {expected[i]})");
        }
    }
}
