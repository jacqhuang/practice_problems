class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int j = s.length()-1;
        int i = 0;
        while(i < j) {
            while(i < j && !isVowel(str[i])) {
                i++;
            }
            while(i < j && !isVowel(str[j])) {
                j--;
            }

            char temp = str[i];
            str[i] = str[j];
            str[j] = temp; 
            i++;
            j--;

        }
        return String.valueOf(str);
    }

    private boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
        ) ? true : false;
    }
}

/*
    used two pointers, we will search for the vowel at i and then search for the vowel at j,
    upon finding the two vowels, we will swap them and increment to find the next vowel.
    after we have reached where the two pointers meet we end the loop and return the result.

    time complexity: O(n)
    space complexity: O(n)
*/