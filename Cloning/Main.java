package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human markus=new Human(20, "Markus Holloway");
        // Human twin=markus;
        Human twin=(Human)markus.clone();
        System.out.println(twin.name+" "+twin.age);
        // here a shallow copy is being made
        // System.out.println(Arrays.toString(twin.arr));
        // twin.arr[0]=100;
        // System.out.println(Arrays.toString(markus.arr));
        //output for deep copying
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        System.out.println(Arrays.toString(markus.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
