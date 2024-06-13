class Solution {
    public boolean isPalindrome(int x) {
        int reversenum=0;
        int original = x;
        while(original >0)
        {
           int  lastdigit= original % 10;
            reversenum = reversenum * 10 + lastdigit;
            original = original/10;
        }
        if(reversenum == x)
        return true;
        else
        return false;


    }
}