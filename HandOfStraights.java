import java.util.*;
public class HandOfStraights {
    public static void main(String[] args) {
        int[] hand={1,2,3,6,2,4,3,7,8};
        int groupSize=3;
        System.out.println(isNStraightHand(hand, groupSize));
    }
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0) return false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<hand.length;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        int[] keys=new int[map.size()];
        int idx=0;
        for(Map.Entry<Integer,Integer> el:map.entrySet()){
            keys[idx++]=el.getKey();
        }
        Arrays.sort(keys);
        for(int i=0;i<keys.length;i++){
            int count=map.get(keys[i]);
            if(map.get(keys[i])>0){
            for(int j=0;j<groupSize;j++){
                int currCard=keys[i]+j;
                if(!map.containsKey(currCard) || map.get(currCard)<count){
                    return false;
                }
                map.put(currCard,map.get(currCard)-count);
                
            }
            }
        }
        return true;
    }
}
