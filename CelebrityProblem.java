public class CelebrityProblem {
    public static int findCelebrity(int n) {
        // Write your code here.
		int low=0,high=n-1;
		while(low<high){
			if(Runner.knows(low,high)){
				
				low++;
			}
			else{
				high--;
			}
			
			
			
		}
		for(int i=0;i<n;i++){
			if(Runner.knows(low,i)){
				return -1;
			}
			if(i!=low && !Runner.knows(i,low)){
				return -1;
			}
		}
		return low;
    }
}
