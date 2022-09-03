import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
		System.out.println(fizzy(3));
	}
	static List<String> fizzy(int n){
	    List list= new ArrayList<String>();
	    for(int i=0;i<n;i++){
	        if((i+1)%3==0 && (i+1)%5==0){
	            list.add("FizzBuzz");
	        }
	        else if((i+1)%3==0){
	            list.add("Fizz");
	        }
	        else if((i+1)%5==0){
	            list.add("Buzz");
	        }
	        else{
	            list.add(String.valueOf(i+1));
	        }
	        
	    }
	    return list;
	}
}
