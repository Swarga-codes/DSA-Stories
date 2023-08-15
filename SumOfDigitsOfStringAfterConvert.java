import java.util.HashMap;

public class SumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        String s="leetcode";
        int k=2;
       System.out.println(getLucky(s, k)); 
    }
     public static int getLucky(String s, int k) {
        HashMap<String, Integer> map=new HashMap<>();
        int val=1;
        int sum=0;
        String tmp="";
        for(char ch='a';ch<='z';ch++){
            map.put(ch+"",val++);
        }
        for(int i=0;i<s.length();i++){
            tmp+=map.get(s.charAt(i)+"");
        }
        for(int i=0;i<tmp.length();i++){
            sum+=Integer.parseInt(tmp.charAt(i)+"");
        }
        if(k==1){
            return sum;
        }
        k--;
        while(k!=0){
            sum=digitSum(sum);
            k--;
        }
        return sum;
    }
    public static int digitSum(int n){
       if(n<10){
           return n;
       }
        int s=0;
        while(n!=0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}
