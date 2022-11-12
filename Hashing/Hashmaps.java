package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        //insertion
        map.put("India", 120);
        map.put("US", 20);
        map.put("China", 150);
        System.out.println(map);
        //search for key
        if(map.containsKey("India")){
            System.out.println("Key found!!");
        }
        if(!map.containsKey("Canada")){
            System.out.println("Doesn't exist in map!");
        }
        //Overwrites if the same key is put again on map
        map.put("India", 130);
        System.out.println(map);
        // get the value from the key
        System.out.println(map.get("India"));
        //another way of iterating over elements
    int[] arr={1,3,4};
        for(int val:arr){
            System.out.println(val+" ");
        }
        //One way of iterating over HashMaps
       for(Map.Entry<String,Integer> e: map.entrySet()){
        System.out.println(e.getKey()+" : "+e.getValue());
       }
       //Another way of iterating over HashMaps
       Set<String> keys=map.keySet();
       for(String key: keys){
        System.out.println(key+" : "+map.get(key));
       }
//removing of elements in HashMaps
System.out.println("Before removal:");
System.out.println(map);
map.remove("India");
System.out.println("After removal:");
System.out.println(map);
    }
}
