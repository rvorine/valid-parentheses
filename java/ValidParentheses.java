import java.util.Stack;

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
public class ValidParentheses {
    
    /**
     * Check if the given string has valid parentheses
     * 
     * @param s The string to check
     * @return true if parentheses are valid, false otherwise
     */
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        
        return stack.isEmpty();
    }
    
    /**
     * Main method for testing
     */
    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        
        // Test cases
        String[] testCases = {"()", "()[]{}", "(]", "([)]", "{[]}", ""};
        boolean[] expected = {true, true, false, false, true, true};
        
        System.out.println("Valid Parentheses - Java Implementation");
        System.out.println("========================================\n");
        
        for (int i = 0; i < testCases.length; i++) {
            String test = testCases[i];
            boolean result = solution.isValid(test);
            String status = (result == expected[i]) ? "✓" : "✗";
            System.out.printf("%s Test: \"%s\" => %s (Expected: %s)\n", 
                status, test, result, expected[i]);
        }
    }
}
