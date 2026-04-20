class Solution {
    public void reverStringHelper(char[] s, int start, int end)
    {
        //base case
        if(start >= end)
        {
            return ;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverStringHelper(s,start + 1, end - 1);
    }
    public void reverseString(char[] s) {
        reverStringHelper(s,0 ,s.length-1);
    }
}