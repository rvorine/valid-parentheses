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
 * @param {string} s - The string to check
 * @return {boolean} - true if parentheses are valid, false otherwise
 */
function isValid(s) {
    if (s === null || s === undefined || s.length % 2 !== 0) {
        return false;
    }
    
    const stack = [];
    const matching = {
        '(': ')',
        '{': '}',
        '[': ']'
    };
    
    for (let char of s) {
        if (char in matching) {
            stack.push(char);
        } else {
            if (stack.length === 0) {
                return false;
            }
            
            const top = stack.pop();
            if (matching[top] !== char) {
                return false;
            }
        }
    }
    
    return stack.length === 0;
}

/**
 * Main function for testing
 */
function main() {
    // Test cases
    const testCases = ["()", "()[]{}", "(]", "([)]", "{[]}", ""];
    const expected = [true, true, false, false, true, true];
    
    console.log("Valid Parentheses - JavaScript Implementation");
    console.log("==============================================\n");
    
    for (let i = 0; i < testCases.length; i++) {
        const test = testCases[i];
        const result = isValid(test);
        const status = (result === expected[i]) ? "✓" : "✗";
        console.log(`${status} Test: "${test}" => ${result} (Expected: ${expected[i]})`);
    }
}

// Run tests
main();

// Export for use as module
if (typeof module !== 'undefined' && module.exports) {
    module.exports = { isValid };
}
