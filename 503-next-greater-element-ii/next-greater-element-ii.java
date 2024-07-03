class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int result [] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        //Two passes
        //store the indexes (because duplicate elements also exist)
        for(int i =2 * nums.length-1; i>=0; i--)
        { while(!stack.isEmpty() && nums[i%nums.length]>=nums[stack.peek()])
        {
            stack.pop();
        }
        
            result[i % nums.length] = stack.isEmpty()?-1 : nums[stack.peek()]; 
              stack.push(i%nums.length);
        }
        return result;

    }
}