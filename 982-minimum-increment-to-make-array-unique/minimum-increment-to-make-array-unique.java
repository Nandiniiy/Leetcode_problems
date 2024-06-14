class Solution {
    public int minIncrementForUnique(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]<= nums[i-1])
            {
                int newvalue = nums[i-1] +1;
                count = count + newvalue - nums[i];
                nums[i] = newvalue;
            }
        }
        return count;
    }
}