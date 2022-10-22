package Generics;
import java.util.*;
//Here T should either be of Number class or its subclasses
public class WildCardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public WildCardExample(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void getList(List<Number> list){
        //here we can have Number values in our parameter 
    }
    public void getList2(List<? extends Number> list){
        //here we can have Number values in our parameter as well as the subclasses of the Number class
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
    WildCardExample<Integer> list=new WildCardExample<>();
    for (int i = 0; i < 14; i++) {
        list.add(2*i);
    }
    System.out.println(list);
}
}
