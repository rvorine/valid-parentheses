import java.util.Stack

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
class ValidParentheses {
    
    /**
     * Check if the given string has valid parentheses
     * 
     * @param s The string to check
     * @return true if parentheses are valid, false otherwise
     */
    fun isValid(s: String?): Boolean {
        if (s == null || s.length % 2 != 0) {
            return false
        }
        
        val stack = Stack<Char>()
        
        for (c in s) {
            when (c) {
                '(', '{', '[' -> stack.push(c)
                else -> {
                    if (stack.isEmpty()) {
                        return false
                    }
                    
                    val top = stack.pop()
                    if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                        return false
                    }
                }
            }
        }
        
        return stack.isEmpty()
    }
}

/**
 * Main function for testing
 */
fun main() {
    val solution = ValidParentheses()
    
    // Test cases
    val testCases = arrayOf("()", "()[]{}", "(]", "([)]", "{[]}", "")
    val expected = booleanArrayOf(true, true, false, false, true, true)
    
    println("Valid Parentheses - Kotlin Implementation")
    println("==========================================\n")
    
    for (i in testCases.indices) {
        val test = testCases[i]
        val result = solution.isValid(test)
        val status = if (result == expected[i]) "✓" else "✗"
        println("$status Test: \"$test\" => $result (Expected: ${expected[i]})")
    }
}
