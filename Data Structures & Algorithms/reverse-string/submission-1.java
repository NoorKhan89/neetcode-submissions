
class Solution {
    public void reverseString(char[] s) {
        int i=0; 
        int j=s.length -1;
        while(i< j)
        {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }
}

/*
class Solution {
    public void reverStringHelper(char[] s, int start, int end)
    {
        //base case
        if(start >= end)
        //  ["n","e","e","t"]
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
*/