class RandomizedSet {
    Random rand;
    Map<Integer, Integer> map;
    List<Integer>list;
    public RandomizedSet() {
        rand = new Random();
        map= new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
        {
             return false;
        }
        int idx = list.size();
        map.put(val, idx);
        list.add(list.size(), val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
        {
            return false;
        }

        int idx = map.get(val);
        int lastIdx = list.size() -1;
        int lastEle = list.get(list.size() -1);
        list.set(idx, lastEle);
        list.remove(list.size() -1);
        map.remove(val);
        if(idx != lastIdx)
        {
            map.put(lastEle, idx);
        }
        return true;
    }
    
    public int getRandom() {

       int idx =rand.nextInt(list.size());
       return list.get(idx); 
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */