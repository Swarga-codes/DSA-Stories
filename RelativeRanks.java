import java.util.*;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] score={5,4,1,3,2};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
    public static String[] findRelativeRanks(int[] score) {
        int[] temp=new int[score.length];
        for(int i=0;i<score.length;i++){
            temp[i]=score[i];
        }
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<score.length;i++){
            map.put(temp[i],score.length-i);
        }
        String[] res=new String[score.length];
        for(int i=0;i<score.length;i++){
            if(map.get(score[i])==1){
                res[i]="Gold Medal";
            }
            else if(map.get(score[i])==2){
                res[i]="Silver Medal";
            }
            else if(map.get(score[i])==3){
                res[i]="Bronze Medal";
            }
            else{
                res[i]=map.get(score[i])+"";
            }
        }
        return res;
    }
}
