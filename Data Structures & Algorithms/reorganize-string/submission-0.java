class HeapElement
{
	char cH;
	int count;
	public HeapElement(char c, int co)
	{
		cH = c;
		count =co;
	}
}
class Solution
{
	public String reorganizeString(String s)
	{
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray())
		{
			map.put(c,map.getOrDefault(c, 0) +1);
		}
		PriorityQueue<HeapElement> pq = new PriorityQueue<>((a, b)-> b.count - a.count);
		for (Map.Entry<Character, Integer> entry: map.entrySet())
		{
			pq.add(new HeapElement(
				entry.getKey(),
				entry.getValue()
				));
		}
		StringBuilder sB = new StringBuilder();
		for (int i=0; i< s.length(); i=i+1)
		{
			HeapElement max1 = pq.remove();
			char c1 = max1.cH;
			
			if (sB.length() == 0 || sB.charAt(sB.length() -1) != c1)
			{
				sB.append(c1);
				max1.count = max1.count -1;
				
				if (max1.count > 0)
				{
					pq.add(new HeapElement(c1, 
						max1.count));
					continue;
				}
			}
			else
			{
				if (pq.isEmpty())
				{
					return "";
				}
				HeapElement max2 = pq.remove();
				char c2 = max2.cH;
				sB.append(c2);
				max2.count = max2.count -1;
				
				if (max2. count >0)
				{
					pq.add(new HeapElement(
						c2,
						max2.count
						));
				}
				
				if (max1.count > 0)
				{
					pq.add(new HeapElement(
						c1, max1.count
						));
					continue;
				}
			}
		}
		
		return sB.toString();
	}
}