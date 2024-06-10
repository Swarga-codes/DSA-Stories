import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights={1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int[] expected=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            expected[i]=heights[i];
        }
        
        Arrays.sort(expected);
          
        int counter=0;
        for(int i=0;i<heights.length;i++){
            if(expected[i]!=heights[i]){
                counter++;
            }
        }
        return counter;
    }
}
