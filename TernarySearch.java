import java.util.*;

class ternarySearch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array:");
        for (int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x=in.nextInt();
        int l=0;
        int r=a.length-1;
        int index=ternary(a,l,r,x);
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is present at index: "+ (index+1));
        }
    }

    static int ternary(int arr[],int l,int r, int key){
        while(r>=l) {
            int mid1= l + (r-l)/3;
            int mid2= r - (r-l)/3;

            if(key==arr[mid1]){
                return mid1;
            } 
             if(key==arr[mid2]){
                return mid2;
            }
            if(key<arr[mid1]){
                return ternary(arr,l,mid1-1,key);
            } else if(key>arr[mid2]){
                return ternary(arr,mid2+1,r,key);
            }else{
                return ternary(arr,mid1+1,mid2-1,key);
            } 
            
        } return -1;
    }
}