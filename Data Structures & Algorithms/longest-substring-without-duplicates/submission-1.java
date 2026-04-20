class Solution {
    public int lengthOfLongestSubstring(String s) {

    	int max=0;
		 int i=0;
		 int j=0;
		
		Set<Character> set = new HashSet<>();
		
		while (j < s.length())
		{
			char c = s.charAt(j);
			
			while (set.contains(c))
			{
				set.remove(s.charAt(i));
				i=i+1;
			}
			set.add(c);
			max=Math.max(max,j-i+1);
			j = j + 1;
		}
		return max;	
    }
}
    
   /*
        int max=0;
      for(int i=0; i<s.length();i=i+1)
      {
        Set <Character> set = new HashSet<>();
        int len=0;

        for(int j=i; j<s.length(); j=j+1)
        {
            char c = s.charAt(j);

            if(set.contains(c))
            {
                break;
            }
            set.add(c);
            max=Math.max(max,j-i+1);
        }
      }  
      return max;
    }
}

*/

