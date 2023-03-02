import java.util.*;
public class PascalsTrianglePart2 {
    public static void main(String[] args) {
        int rowIndex=5;
System.out.println(getRow(rowIndex));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
          for(int i=0;i<=rowIndex;i++){
              List<Integer> tmp=new ArrayList<>();
              for(int j=0;j<=i;j++){
                  if(j==0 || j==i){
                      tmp.add(1);
                  }
                  else{
                      tmp.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                  }
              }
              list.add(tmp);
          }
          return list.get(rowIndex);
      }
}
