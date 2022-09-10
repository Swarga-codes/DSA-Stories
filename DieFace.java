import java.util.ArrayList;

public class DieFace {
    public static void main(String[] args) {
        int t=4;
        diceFace("", t,6);//void function call
        System.out.println(diceFaceList("", t,6));//arraylist function call
    }
    //function that returns the no of possibilities of achieveing the given target in a dice based on no of faces
    static void diceFace(String s, int target, int face){
        if(target==0){
            System.out.println(s);
            return;
        }
        for(int i=1;i<=face && i<=target;i++){
            diceFace(s+i, target-i,face);
        }
    }
    //function that returns the possibilities but in an ArrayList based on no of faces
    static ArrayList<String> diceFaceList(String s, int target,int face){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
        list.add(s);
        return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=face && i<=target;i++){
            ans.addAll(diceFaceList(s+i, target-i,face));
        }
        return ans;
    }
}
