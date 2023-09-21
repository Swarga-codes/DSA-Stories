import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] nums={0,1,2,2,4,4,1};
        System.out.println(mostFrequentEven(nums));
    }
    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int max=-1;
        int ele=-1;
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getKey()%2==0 && (entry.getValue()>max || entry.getValue()==max && entry.getKey()<ele)){
                  max=entry.getValue();
                ele=entry.getKey();
            }
        }
        return ele;
    }
}
