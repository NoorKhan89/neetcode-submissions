class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
     boolean[] arr = new boolean[26];
     for(char c :allowed.toCharArray())
     {
        arr[c -'a'] = true;
     }   
     int count =0;
     for(String word : words)
     {
        boolean isConsistent = true;
        for(char c : word.toCharArray())
        {
            if(!arr[c -'a'])
            {
                isConsistent = false;
                break;
            }
        }
        if(isConsistent == true)
        {
            count ++;
        }
     }
     return count;
    }
}