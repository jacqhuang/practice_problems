class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3){
            return false;
        }

        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for(int num : nums) {
            if(num <= i) {
                i = num;
            } else if(num <= j) {
                j = num;
            } else {
                return true;
            }
        }
        return false;
    }
}

/*
By going through each of the indices, we'll set the first index to i, and the following one to j
i will always be the smallest integer that we can find, and j will always be the next smallest number
if we going through the entire array without finding 3 numbers that are a triplet, it will return false
else if we found a number larger than the two smallest, then we know we have found a triplet.)

Time complexity: O(n)
Space complexity:O(1)

Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

 

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
*/