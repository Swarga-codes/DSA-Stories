import java.util.Stack;

public class LargestRectangeInHistogram {
    public static void main(String[] args) {
        int[] heights={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int[] heights) {
        int[] nse=nextSE(heights);
        int[] pse=prevSE(heights);
        int res=0;
        for(int i=0;i<heights.length;i++){
            res=Math.max(res,heights[i]*(nse[i]-pse[i]-1));
        }
        return res;
    }
    public static int[] nextSE(int[] heights){
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int[] nse=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        return nse;
    }
    public static int[] prevSE(int[] heights){
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int[] pse=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        return pse;
    }
}
