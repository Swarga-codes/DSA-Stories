import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public static void main(String[] args) {
       String[] ops = {"5","-2","4","C","D","9","+","+"};
       System.out.println(calPoints(ops));
    }
    public static int calPoints(String[] operations) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                li.add(li.get(li.size()-1)+li.get(li.size()-2));
            }
            else if(operations[i].equals("D")){
                li.add(li.get(li.size()-1)*2);
            }
            else if(operations[i].equals("C")){
                li.remove(li.size()-1);
            }
            else{
                li.add(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        for(int i=0;i<li.size();i++){
            sum+=li.get(i);
        }
        return sum;
    }
}
