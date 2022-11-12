package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsets {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        //insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        System.out.println(set);
        //search in hashset
        if(set.contains(2)){
            System.out.println("It is present");
        }
        if(!set.contains(9)){
            System.out.println("Doesn't contain");
        }
        //remove in hashset
        set.remove(3);
        if(!set.contains(3)){
            System.out.println("It doesn't contain 3");
        }
    Iterator it=set.iterator();
    while(it.hasNext()){
        System.out.print(it.next()+" ");
    }
    System.out.println();
    }
}
