class LFUCache {
    public static Map<Integer,Integer> keyToValue;
    public static Map<Integer,Integer> keyToFreq;
    public static Map<Integer,LinkedHashSet<Integer>> freqToKey;
    int capacity=0,minFreq=0;
    public LFUCache(int capacity) {
        this.capacity=capacity;
        this.keyToValue=new HashMap<>();
        this.keyToFreq=new HashMap<>();
        this.freqToKey=new HashMap<>();
    }
    
    public int get(int key) {
        if(!keyToValue.containsKey(key)) return -1;
        int oldFreq=keyToFreq.get(key);
        int newFreq=oldFreq+1;
        keyToFreq.put(key,newFreq);
        freqToKey.get(oldFreq).remove(key);
        if(freqToKey.get(oldFreq).isEmpty()){
            freqToKey.remove(oldFreq);
            if(minFreq==oldFreq) minFreq=newFreq;
        }
        LinkedHashSet<Integer> newSet=freqToKey.get(newFreq);
        if(newSet==null){
            newSet=new LinkedHashSet<>();
            freqToKey.put(newFreq,newSet);
        }
        newSet.add(key);
        return keyToValue.get(key);
    }
    
    public void put(int key, int value) {
        if(keyToValue.containsKey(key)){
            keyToValue.put(key,value);
            get(key);
            return;
        }
        else if(keyToValue.size()>=capacity){
            LinkedHashSet<Integer> minFreqSet=freqToKey.get(minFreq);
            int removeEl=minFreqSet.iterator().next();
            keyToValue.remove(removeEl);
            keyToFreq.remove(removeEl);
            minFreqSet.remove(removeEl);
            if(minFreqSet==null) {
                freqToKey.remove(minFreq);
            }
        }
        keyToValue.put(key,value);
        keyToFreq.put(key,1);
        LinkedHashSet<Integer> set=freqToKey.get(1);
        if(set==null){
            set=new LinkedHashSet<>();
            freqToKey.put(1,set);
        }

        set.add(key);
        minFreq=1;
        
    }
}