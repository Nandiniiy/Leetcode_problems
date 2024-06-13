class Solution {
    public int majorityElement(int[] nums) {
      //approach 3  
       //Arrays.sort(nums);
       //return nums[nums.length/2];
       
       //approach 4
       //Boyer moore voting method
       int me=0;
       int count =0;
       for(int val : nums)
       {
        if(count ==0)
        {
            me=val;
            count++;
        }
        else if(me== val)
        {
          count++;
        }
        else
        {
            count--;

        }
       }
       return me;
    }
}