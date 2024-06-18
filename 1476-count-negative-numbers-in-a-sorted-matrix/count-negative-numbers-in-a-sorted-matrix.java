class Solution {
    public int countNegatives(int[][] grid) {
       //approach 1 - brute force
       int count=0;
       for(int rows[] : grid)
       {
        for( int val : rows)
        {
            if(val<0)
            {
                count++;
            }
        }
       }
       return count;
    }
}