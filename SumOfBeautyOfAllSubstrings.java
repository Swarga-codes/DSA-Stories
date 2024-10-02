import java.util.*;
class SumOfBeautyOfAllSubstrings{
    public static void main(String[] args){
String s="aabcb";
System.out.println(beautySum(s));

    }
    public static int beautySum(String s) {
        if(s.length()<3) return 0;
        int res=0;
       
        for(int i=0;i<s.length();i++){
              HashMap<Character,Integer> map=new HashMap<>();
               
            for(int j=i;j<s.length();j++){
                  map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                if(j-i+1>=3){
                 int max=Integer.MIN_VALUE;
                 int min=Integer.MAX_VALUE;
                 for(int freq:map.values()){
                     max=Math.max(max,freq);
                     min=Math.min(min,freq);
                 }
                   res=res+(max-min);
                }
            }
        }
        return res;
      
        
    }
}