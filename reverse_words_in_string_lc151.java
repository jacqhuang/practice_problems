class Solution {
    public String reverseWords(String s) {
        String[] strs = s.trim().split("\\s+");
        Stack<String> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(String str:strs) {
            st.push(str);
        }

        while(!st.isEmpty()) {
            while(st.peek().contains("\\s")) {
                st.pop();
            }
            String temp = st.pop();
            result.append(temp);
            if(!st.isEmpty()) {
                result.append("\\s");
            }
        }

        return result.toString();

    }
}

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