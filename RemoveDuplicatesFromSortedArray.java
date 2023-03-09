import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] arr) {
    	HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++){
		    set.add(arr[i]);
		}
		Iterator<Integer> itr=set.iterator(); 
		int j=0;
		while(itr.hasNext()){
		 arr[j]=itr.next();
		 j++;
		}
		for(int i=set.size();i<arr.length;i++){
		    arr[i]=0;
		}
        Arrays.sort(arr,0,set.size());
		return j;
	
    }
}
