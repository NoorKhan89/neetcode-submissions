class Solution {
    Map<Character, Character> map = new HashMap<>();
    public boolean isValid(String s) 
    {
            map.put('(',')');
            map.put('{','}');
            map.put('[',']');

            Stack<Character> stack = new Stack<>();
            for(char c : s.toCharArray())
            {
                if(map.containsKey(c))
                {
                    stack.push(c);
                }
                else
                {
                    if(stack.isEmpty())
                    {
                        return false;
                    }
                    
                    char t = stack.pop();

                    if(map.get(t) != c)
                    {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
    }
}







