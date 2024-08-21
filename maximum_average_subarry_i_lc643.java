class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(sum, maxSum);
        }
        return (double)maxSum/k;
    }
}

//Using the sliding window technique, you can find the maximum contiugous sum.
//By subtracting the first index, and adding the last index in the subarray,
//that way you don't have to recalculate the entire subarray

//Time complexity: O(N)
//Space complexity: O(1)