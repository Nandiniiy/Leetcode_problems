class Solution {
    public int[] productExceptSelf(int[] nums) {
        //computer prefix product for left to right product
        //computer suffix product for right to left product
        //finally the answer left and right product
        //approach 1- prefic suffix
        //int left[] = new int[nums.length]; //prefix product
        //int right[] = new int[nums.length]; //suffix product
        //int finalans[] = new int[nums.length];
        //left[0] = 1;
        //for(int i=1; i<nums.length; i++)
        //{
          //  left[i] = left[i-1] * nums[i-1];
        //}
        //right[right.length-1] = 1;
        //for(int i=right.length-2; i>=0; i--)
        //{
       //     right[i] = right[i+1] * nums[i+1];
        //}
       // for(int i=0; i<finalans.length;i++)
       // {
      //      finalans[i] = left[i] * right[i];
        //}
        //return finalans;

        int finalans[] = new int[nums.length];
        finalans[0] =1;
        for(int i=1; i<finalans.length; i++)
        {
            finalans[i] = finalans[i-1] * nums[i-1];
        }
        //computer suffix product
        int right =1;
        for(int i= finalans.length-1; i>=0; i--)
        {
            finalans[i] = finalans[i] * right;
            right = right * nums[i];
        }
        return finalans;
    }
}