class Solution {
    public int majorityElement(int[] nums) {
        //hashing
        //count freuqncy, and if it is greater than n/2 return it
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int val: nums)
        {
            Integer count = map.get(val);
            if(count!=null)
            {
                count++;
                map.put(val, count);
            }
            else
            { count=1;
                map.put(val,1);
            }
            if(count> nums.length/2)
            return val;
        }
        return -1;
    }
}