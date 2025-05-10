import java.util.*;
class MinimumWindowSubstring{
    public static void main(String[] args){
        String s="ADOBECODEBANC",t="ABC";
        System.out.println(minWindow(s,t));
    }
    public static String minWindow(String s, String t) {
        int l=0,r=0,start=-1,minLen=Integer.MAX_VALUE;
        int cnt=0;
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<t.length();i++){
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }
        while(r<s.length()){
            if(mp.containsKey(s.charAt(r))){
                mp.put(s.charAt(r),mp.get(s.charAt(r))-1);
                if(mp.get(s.charAt(r))>=0){
                cnt++;
            }
            }
            while(cnt==t.length()){
                if(minLen>r-l+1){
                    minLen=r-l+1;
                    start=l;
                }
                if(mp.containsKey(s.charAt(l))){
                    mp.put(s.charAt(l),mp.get(s.charAt(l))+1);
                     if(mp.get(s.charAt(l))>0){
                    cnt--;
                }
                }
               
                l++;
            }
            r++;
        }
        
        return start==-1?"":s.substring(start,start+minLen);
    }
}