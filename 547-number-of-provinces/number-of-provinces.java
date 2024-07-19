class Solution {

    void helper(int node,int[][] isConnected, boolean visited[] )
    { visited[node] = true;
        for(int i=0; i<isConnected.length; i++)
        {
            if(isConnected[node][i] ==1 && !visited[i])
            {
                //connection is there and not visited
                helper(i,isConnected, visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int countcomponents=0;
        boolean visited[] = new boolean[isConnected.length];
        for(int i=0; i<isConnected.length; i++)
        {
           if(!visited[i])
           {
            //if vertex not already visited
            countcomponents++;

            helper(i,isConnected, visited);

           }
        }
        return countcomponents;
    }
}