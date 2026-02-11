"""
Valid Parentheses Solution

Problem: Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
"""


class ValidParentheses:
    """
    Solution class for Valid Parentheses problem
    """
    
    def is_valid(self, s: str) -> bool:
        """
        Check if the given string has valid parentheses
        
        Args:
            s: The string to check
            
        Returns:
            True if parentheses are valid, False otherwise
        """
        if s is None or len(s) % 2 != 0:
            return False
        
        stack = []
        matching = {'(': ')', '{': '}', '[': ']'}
        
        for char in s:
            if char in matching:
                stack.append(char)
            else:
                if not stack:
                    return False
                
                top = stack.pop()
                if matching.get(top) != char:
                    return False
        
        return len(stack) == 0


def main():
    """
    Main function for testing
    """
    solution = ValidParentheses()
    
    # Test cases
    test_cases = ["()", "()[]{}", "(]", "([)]", "{[]}", ""]
    expected = [True, True, False, False, True, True]
    
    print("Valid Parentheses - Python Implementation")
    print("==========================================\n")
    
    for i, test in enumerate(test_cases):
        result = solution.is_valid(test)
        status = "✓" if result == expected[i] else "✗"
        print(f'{status} Test: "{test}" => {result} (Expected: {expected[i]})')


if __name__ == "__main__":
    main()
