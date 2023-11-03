import java.util.*;
public class BuildAnArrayWithStackOperations {
    public static void main(String[] args) {
        int[] target = {1,3};
        int n = 3;
    System.out.println(buildArray(target, n));
    }
    public static List<String> buildArray(int[] target, int n) {
        int i=0,k=1;
        List<String> list=new ArrayList<>();
       while(i<target.length){
           list.add("Push");
           if(k==target[i]){
               i++;
           }
           else{
               list.add("Pop");
           }
           k++;
       } 
    return list;
    }
}
