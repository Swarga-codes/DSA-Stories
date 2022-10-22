package Generics;
import java.util.*;
public class CustomArrayListUsingGenerics<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayListUsingGenerics(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T nums){
        if(isFull()){
            resize();
        }
        data[size++]=nums;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        Object[] tmp=new Object[data.length*2];
        //copies the array
        for (int i = 0; i < data.length; i++) {
            tmp[i]=data[i];
        }
        data=tmp;
    }
    public int size(){
        return size;
    }
    public void set(int index,T val){
        data[index]=val;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public T remove(){
        T rem=(T)(data[--size]);
        return rem;
    }
@Override
public String toString() {
    // TODO Auto-generated method stub
    return Arrays.toString(data)+", size="+size;
}
public static void main(String[] args) {
    CustomArrayListUsingGenerics<Integer> list=new CustomArrayListUsingGenerics<>();
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list);
    CustomArrayListUsingGenerics<String> list2=new CustomArrayListUsingGenerics<>();
    list2.add("Markus");
    list2.add("Wrench");
    list2.add("Sitara");
    System.out.println(list2);
}
}
