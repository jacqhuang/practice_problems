class Solution {
    public String reverseWords(String s) {
        String[] strs = s.trim().split("\\s+");
        Stack<String> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(String str:strs) {
            st.push(str);
        }

        while(!st.isEmpty()) {
            result.append(st.pop());
            if(!st.isEmpty()) {
                result.append("\\s");
            }
        }

        return result.toString();

    }
}


/*
Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */


/*
    first we get an array of strings by timming the whitespace at the ends,
    and splitting the strings based on the spaces
    I push the array of strings to a stack, because of its FILO structure.
    After populating the stack, I can start going through the elements,
    checking that I pop off all the entries that are just spaces
    I add spaces after each string except the last.

    Finally I reture the result using the toString method in the StringBuilder class.

    Time Complexity: O(n)
    Space Complexity: O(n)
*/