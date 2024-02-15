class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0;
        if(nums.length==1) return;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                j++;
                nums[i] = temp;
            }
        }
    }
}

/*
we look at which index is not 0, then move it to the position before, we increment j, knowing that we have filled that space

i = 0, [0,1,0,3,12]
i = 1, [1,0,0,3,12]
i = 3, [1,3,0,0,12]
i = 4, [1,3,12,0,0]

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 
*/