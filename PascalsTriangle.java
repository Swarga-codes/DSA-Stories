import java.util.*;;
public class PascalsTriangle {
    public static void main(String[] args) {
        int n=5;
        System.out.println(generate(n));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
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
        return list;
    }
}
