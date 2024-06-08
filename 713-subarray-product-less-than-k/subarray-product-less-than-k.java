class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
        {
            return 0;
        }
        //maintain 2 pointer
        //left pointer, right pointer (on start)
        int left=0;
        int product = 1;
        int count = 0;
        for(int right = 0; right<nums.length; right++)
        {
          product = product * nums[right];
          while(product>=k)
          {
            product = product/nums[left];

            left++;
          }
          count = count + right - left + 1;
        }
        return count;
    }
}