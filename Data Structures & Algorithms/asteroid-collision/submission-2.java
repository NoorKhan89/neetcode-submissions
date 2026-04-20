class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> aI= new Stack<>();

        for(int i=0; i<asteroids.length;i = i + 1)
        {
            int ast = asteroids[i];

            while(true)
            {
                if(aI.isEmpty())
                {
                    aI.push(i);
                    break;
                }
                if(ast >= 0)
                {
                    aI.push(i);
                    break;
                }

                int idx = aI.peek();
                if(asteroids[idx] >= 0)
                {
                    int absAst = Math.abs(ast);
                    
                    if(asteroids[idx] > absAst)
                    {
                        break;
                    }
                    else if(asteroids[idx] == absAst)
                    {
                        aI.pop();
                        break;
                    }
                    else
                    {
                        aI.pop();
                    }
                }
                else 
                {
                    aI.push(i);
                    break;
                }
            }
        }
        
        int[] res = new int[aI.size()];
        int i = res.length -1;
        while(!aI.isEmpty())
        {
            res[i] = asteroids[aI.pop()];
            i = i - 1;
        }
        return res;
    }
}













