class Solution {
    public int waysToSplitArray(int[] nums) {
       long entiresum = 0;
       int count =0;
       for(int i : nums)
       {
        entiresum = entiresum + i;

       }
       //now remove the current everytime from the entire sum
       //and store the curretn sum in the left sum
       long leftsum = 0;
       for(int i=0; i<nums.length-1; i++)
       {
        leftsum = leftsum + nums[i];
        entiresum = entiresum - nums[i];
        if(leftsum>= entiresum)
        {
            count++;
        }

       }
       return count;
    }
}