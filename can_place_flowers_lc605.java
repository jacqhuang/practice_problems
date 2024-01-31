class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0){
                int prev= (i == 0 || flowerbed[i-1] == 0) ? 0 : 1;
                int next= (i == flowerbed.length-1 || flowerbed[i+1] == 0) ? 0 : 1;
                if(prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}

/*you can place flowers when the following conditions are met:
    the current index is 0, and the left and right values are 0
    when you are at the beginning index, set the left value to 0
    when you are at the end index, set the right value to 0.
    Time complexity: O(n)
    Space Complexity: O(1)
*/