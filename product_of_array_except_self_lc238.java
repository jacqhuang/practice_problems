class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int leftProduct= 1;
        int rightProduct= 1;

        for(int i = 0; i < nums.length; i++){
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        for(int i = nums.length-1; i >= 0; i--){
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
}

/*
Given array of nums find the product of the array with every integer in the array except the current index

    To do this efficiently, we first find the products of all the numbers left of the index
    then when can multiply by all the integers right of the index.

    [1,2,3,4] -> find product to the left -> [1,1,2,6] -> then find product to right of the index and multiply -> [1*(24),1*(12),2*(4),6*1] -> [24,12,8,6]

    Time complexity: O(2n) = O(n)
    Space complexity: O(n)

*/