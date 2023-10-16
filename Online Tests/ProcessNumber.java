public class ProcessNumber {
    public static void main(String[] args) {
		int n=19;
		System.out.println(processNumber(n));
	}
	public static String processNumber(int n){
	    String dummy="";
	    while(n!=0){
	        dummy+=n%2;
	        n=n/2;
	    }
	    String res="";
	    int k=0;
	    for(int i=0;i<dummy.length();i++){
	        if(dummy.charAt(i)=='1'){
	            
	            k++;
	        }
	    }
	    int x=(dummy.length()%k)-1;
	    char ch=(char)('A'+x);
	    int j=0;
	    while(j<dummy.length()){
	        if(dummy.charAt(j)=='0'){
	            j++;
	            continue;
	        }
	        else{
	            res+=dummy.charAt(j)+""+ch;
	            ch=(char)(ch+1);
	            j++;
	        }
	    }
	    return res;
	}
}
