package Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int nums){
        if(isFull()){
            resize();
        }
        data[size++]=nums;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        int[] tmp=new int[data.length*2];
        //copies the array
        for (int i = 0; i < data.length; i++) {
            tmp[i]=data[i];
        }
        data=tmp;
    }
    public int size(){
        return size;
    }
    public void set(int index,int val){
        data[index]=val;
    }
    public int get(int index){
        return data[index];
    }
    public int remove(){
        int rem=data[--size];
        return rem;
    }
@Override
public String toString() {
    // TODO Auto-generated method stub
    return Arrays.toString(data)+", size="+size;
}
    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        // list.add(1);
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list.get(3));
        System.out.println(list.remove());
        list.set(1,45);
        System.out.println(list);
    }
}
