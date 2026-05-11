class Solution {
   public boolean isPossible(int[] piles, int speed,int hours)
	{
		long totalHours =0;
		for (int pile :piles)
		{
			totalHours = totalHours +(int) Math.ceil((double) pile/speed);
		}
		return totalHours <= hours;
	}
	public int minEatingSpeed(int[] piles, int h)
	{
		int min =1;
		int max = Integer.MIN_VALUE;
		
		for (int pile : piles)
		{
			max = Math.max(pile,max);
		}
		
		for (int speed = min; speed <= max; speed = speed +1)
		{
			if (isPossible(piles, speed, h))
			{
				return speed;
			}
		}
		return -1; 
    }
}
