class Solution {
    public int maxVowels(String s, int k) {
        int vowels = 0;
        int maxVowels = 0;
        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))){
                vowels++;
            }
        }
        maxVowels = vowels;
        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                vowels++;
            }
            if(isVowel(s.charAt(i - k))){
                vowels--;
            }
            maxVowels = Math.max(vowels, maxVowels);
            if(maxVowels == k) {
                return maxVowels;
            }
        }
        return maxVowels;
    }

    private boolean isVowel (char c) {
        boolean vowelCheck = ((c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u') ? true : false);
        return vowelCheck;
    }
}

//using sliding window technique
//O(N)