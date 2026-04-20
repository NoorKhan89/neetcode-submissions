class Solution {
    public int getCommonCountMatchCharacters(String s1, String s2)
    {
        if(s1.length() == 0 || s2.length() == 0)
        {
            return 0;
        }
        if(s1.length() > s2.length())
        {
            return getCommonCountMatchCharacters(s2,s1);
        }
        int count =0;
        // a a p l e
        // a a p l e
        // i -->
        // count = 1, 2, 3, 4, 5


        for(int i=0; i< s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                return count;
            }
            count ++;
        }
        return count;
    }
    public String longestCommonPrefix(String[] strs) {

        // leets  leetCode  leep

        if(strs == null || strs.length == 0)
        {
            return "";
        }
        if(strs.length == 1)
        {
            return strs[0];
        }
        int minCount = Integer.MAX_VALUE;
        String first = strs[0];

        for(int i=0; i< strs.length; i=i+1)
        {
            int count = getCommonCountMatchCharacters(first,strs[i]);
            minCount =Math.min(minCount, count);
        }
        return first.substring(0, minCount);
    }
}