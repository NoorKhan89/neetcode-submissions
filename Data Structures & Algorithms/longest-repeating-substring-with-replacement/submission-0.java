class Solution {
    public int characterReplacement(String s, int k) {
   
    
      int max=0;
        int i=0;
        int j=0;
        int maxC =0;
        int[] counts = new int[26];

        while(j < s.length())
        {
            char c = s.charAt(j);

            counts[c - 'A'] = counts[c - 'A'] + 1;
            maxC = Math.max(maxC, counts[c - 'A']);

            while((j - i + 1) - maxC > k)
            {
                char d = s.charAt(i);

                counts[d - 'A'] = counts[d - 'A'] - 1;
                i = i + 1;

                for(int l=0; l < 26 ; l= l+1)
                {
                    maxC = Math.max(maxC, counts[l]);
                }
            }
            max = Math.max(max,j-i+1);
            j=j+1;
        }
        return max;
    }
}

 /*    
     
      int max=0;
       for(int i=0; i<s.length(); i=i+1)
       {
        int maxC=0;
        int i=0; int j=0;
        int[] counts= new int[26];
        for(int j=i; j<s.length(); j=j+1)
        {
          char c= s.chartAt(j);
          counts[c-'A'] = counts[c-'A'] +1;
          maxC =Math.maxC(maxC,j-i+1);

          int ops=(j-i+1)-maxC;
          if(ops > k)
          {
            break;
          } 
          max=Math.max(max,j-i+1);
        }
       }  
       return max;
    }
}
*/