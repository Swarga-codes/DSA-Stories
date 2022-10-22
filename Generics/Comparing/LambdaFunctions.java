package Generics.Comparing;

import java.util.ArrayList;
import java.util.function.Consumer;



public class LambdaFunctions {
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>();
       for (int i = 0; i <14; i++) {
        list.add(i+1);
       }
    //    list.forEach((item) -> System.out.println(item*2));
    Consumer<Integer> fun= (item) -> System.out.println(item*2);
    list.forEach(fun);
    
    Operation sum=(a,b) -> a+b;
    Operation prod=(a,b) -> a*b;
    Operation diff=(a,b) -> a-b;
    
    LambdaFunctions calculator=new LambdaFunctions();
    System.out.println(calculator.operate(5,3, diff));
    System.out.println(calculator.operate(5,3, sum));
    System.out.println(calculator.operate(5,3, prod));
    }
    private int operate(int a,int b,Operation ob){
      return ob.operation(a, b);
    }
}
interface Operation{
    int operation(int a,int b);
}
