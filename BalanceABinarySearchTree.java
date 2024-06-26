import java.util.*;
public class BalanceABinarySearchTree {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        populateArray(root,arr);
      return balance(0,arr.size()-1,arr);  
    }
    public static TreeNode balance(int l,int h,List<Integer> arr){
        if(l>h){
            return null;
        }
        int mid=(l+h)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=balance(l,mid-1,arr);
        root.right=balance(mid+1,h,arr);
        return root;
    }
    public void populateArray(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        populateArray(root.left,arr);
        arr.add(root.val);
        populateArray(root.right,arr);
    }
}

  
   class TreeNode {
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
 
