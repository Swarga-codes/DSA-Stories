package Trees;

public class SymmetricTrees {
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
     public boolean isSymmetric(TreeNode p) {
        if(p==null){
            return true;
        }
        if(p.left==null && p.right==null){
            return true;
        }
       return checker(p.left,p.right);
    }
    public boolean checker(TreeNode left, TreeNode right){
        if(left==null && right==null){
            return true;
        }
         if(left==null || right==null){
            return false;
        }
     return left.val==right.val && checker(left.left,right.right) && checker(left.right,right.left);

    }
}
