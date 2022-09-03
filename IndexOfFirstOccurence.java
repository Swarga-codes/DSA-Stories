public class IndexOfFirstOccurence {
	public static void main(String[] args) {
	String haystack="mississipi", needle="issip";
	
	System.out.println(strStr(haystack,needle));
	}
	 public static int strStr(String haystack, String needle) {
         if(haystack.isEmpty()){
            return -1;
        }
        if(haystack.equals(needle)){
            return 0;
        }
    if(haystack.length()<needle.length()){
        return -1;
    }
        
        String temp=haystack;
        for(int i=0;i<haystack.length();i++){
            char ch=temp.charAt(0);
        if(temp.startsWith(needle)){
            return i+temp.indexOf(ch);
        }
        else{
            temp=haystack.substring(i+1);
        }
           
        
        }
        return -1;
         
       
}
}


