class Solution {
    public int countNegatives(int[][] grid) {
       //approach 1 - brute force
       //int count=0;
       //for(int rows[] : grid)
       //{
        //for( int val : rows)
        //{
         //   if(val<0)
          //  {
           //     count++;
            //}
        //}
       //}
       //return count;
     

     //Approach - 2 using Binary search
     int count = 0;
    
     int colslen = grid[0].length;
   
     for(int rows[] : grid)
     {
        int left = 0;
        int right = colslen-1;
        while(left<=right)
        {
            int mid = (right+left)/2;
            if(rows[mid]<0)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        count = count + (colslen -left);
     }
     return count;

    }
}