class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxaverage = Double.MIN_VALUE;
        //sum of first k size window
        int sum=0;
        for(int i =0; i<k; i++)
        {
            sum+=nums[i];
        }
        maxaverage = 1.0 * sum/k;
        //Remaining windows average
        for(int i=k; i<nums.length; i++)
        {
            sum= sum + nums[i] - nums[i-k];
            maxaverage = Math.max(maxaverage, 1.0 * sum/k);
        }
        return maxaverage;
    }
}