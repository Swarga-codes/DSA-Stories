import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        int t=4;
        diceValue("", t);//void function call
        System.out.println(diceList("", t));//arraylist function call
    }
    //function that returns the no of possibilities of achieveing the given target in a dice
    static void diceValue(String s, int target){
        if(target==0){
            System.out.println(s);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            diceValue(s+i, target-i);
        }
    }
    //function that returns the possibilities but in an ArrayList
    static ArrayList<String> diceList(String s, int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
        list.add(s);
        return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            ans.addAll(diceList(s+i, target-i));
        }
        return ans;
    }
}
