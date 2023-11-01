package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModeInBinarySearchTree {
   
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

     public int[] findMode(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        getMode(root,li);
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=1;
        for(int i=0;i<li.size();i++){
            if(map.containsKey(li.get(i))){
                map.put(li.get(i),map.get(li.get(i))+1);
                max=Math.max(max,map.get(li.get(i)));
            }
            else{
                map.put(li.get(i),1);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(map.get(entry.getKey())==max){
                list.add(entry.getKey());
            }
        }
      int[] res=new int[list.size()];
      for(int i=0;i<res.length;i++){
          res[i]=list.get(i);
      }
       return res; 
    }
    public void getMode(TreeNode root,List<Integer> li){
        if(root==null){
            return;
        }
        li.add(root.val);
        getMode(root.left,li);
        getMode(root.right,li);
    }
}
