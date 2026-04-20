class Solution {
   public String getIndexKindaString(String s)
   {
    Map<Character,Integer> map = new HashMap<>();
    StringBuilder sB = new StringBuilder();
    for(int i=0; i < s.length(); i=i+1)
    {
        if(!map.containsKey(s.charAt(i)))
        {
            map.put(s.charAt(i), i);
        }
        sB.append(map.get(s.charAt(i))+ " ");
    }
    return sB.toString();
   }
    public boolean isIsomorphic(String s, String t) {
        String sB = getIndexKindaString(s);
        String tB = getIndexKindaString(t);
        return sB.equals(tB); 
    }
}