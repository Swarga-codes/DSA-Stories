import java.util.*;
public class Flipping {
    public static void main(String[] args) {
        int [][] arr={{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans=Flip(arr);
        for(int i=0;i<arr.length;i++){
           System.out.println(Arrays.toString(ans[i]));
        }

    }
    static int[][] Flip(int[][] image){
        for(int[] i:image){
            for(int j=0;j<(image[0].length+1)/2;j++){
                int temp=i[j] ^ 1;
                i[j]=i[image[0].length-j-1]^1;
                i[image[0].length-j-1]=temp;
                
            }
        }
        return image;
    }
}
