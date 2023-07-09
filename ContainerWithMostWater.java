public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=Integer.MIN_VALUE;
        int area=0;
        while(i<j){
            area=Math.min(height[i],height[j])*(j-i);
            max=Math.max(max,area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
       }
}
