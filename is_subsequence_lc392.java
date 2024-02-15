class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length() == 0) return true;
        if (t.length() == 0 || s.length() > t.length()) return false;

        int i = 0;
        int j = 0;
        while(j < t.length()) {
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            if(i == s.length()){
                return true;
            }
            j++;
        }
        return false;
    }
}

/*
using a double pointer we check if the two characters match, then we increment the pointer for the first string,
 if we come to the end of the length of the first string, that means we have found a subsequence of the second string.

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
*/