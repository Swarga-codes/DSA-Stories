package Hashing;
import java.util.*;

public class MathisonAndPangrams {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    for(int i=0;i<t;i++){
		HashSet<String> set1=new HashSet<>();
		for(char c='a';c<='z';c++){
		    set1.add(c+"");
		}
			HashMap<String,Integer> map=new HashMap<>();
		int count=0;
		for(char c='a';c<='z';c++){
		    map.put(c+"",in.nextInt());
		}
		HashSet<String> set2=new HashSet<>();
		String s=in.next();
			for(int c=0;c<s.length();c++){
		    set2.add(s.charAt(c)+"");
		}
		if(set1.equals(set2)){
		    System.out.println(0);
		}
		else{
		    	HashSet<String> res=new HashSet<>(set1);
        res.removeAll(set2);
         int sum=0;
        for(String r:res){
            sum+=map.get(r);
        }
        System.out.println(sum);
		}
        
	}
	}
}
