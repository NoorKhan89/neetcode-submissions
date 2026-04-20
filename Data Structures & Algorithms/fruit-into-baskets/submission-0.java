class Solution {
    public int totalFruit(int[] fruits) {
      int max=0;
		for (int i=0 ; i< fruits.length ;i=i+1)
		{
			Set<Integer> set = new HashSet<>();		
			
			for (int j=i ; j<fruits.length ;j=j+1)
			{
				set.add(fruits[j]);
				if (set.size() > 2)
				{
					break;
				}
				max= Math.max(max ,j-i+1);
			}
		}
		return max;
	}  
}