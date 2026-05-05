class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();

        for(int ele : arr)
        {
            list.add(ele); // 1 2 3 4 5 
        }
        Collections.sort(list,(a,b) ->{
            int absAFromX = Math.abs(a - x);
            int absBFromX = Math.abs(b - x);

            if(absAFromX == absBFromX)
            {
                return a - b;
            }
            return absAFromX - absBFromX;
        });
        List<Integer> res = new ArrayList<>();
        for(int i=0; i< k; i=i+1)
        {
            res.add(list.get(i)); // 4 3 2 1 
        }
        Collections.sort(res);
        return res;
    }
}









