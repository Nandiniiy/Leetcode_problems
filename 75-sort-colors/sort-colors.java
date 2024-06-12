class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid =0;
        int end = nums.length-1;
        while(mid <= end)
        { if(nums[mid] == 0)
        {
            int s = nums[start];
            nums[start] = nums[mid];
            nums[mid] = s;
            mid++;
            start++;
        }
        else if(nums[mid]==1)
        {
            mid++;
            ///break;
        }
        else
        {
            int temp = nums[mid];
            nums[mid] = nums[end];
            nums[end] = temp;
            end--;
            //break;
        }

        }
    }
}