public class FindElementsInAContaminatedBinaryTree {
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
    TreeNode tmp;
    public FindElementsInAContaminatedBinaryTree(TreeNode root) {
    root.val=0;
    tmp=root;
    recover(root);
    }
    public void recover(TreeNode root){
        if(root==null) return;
        if(root.left!=null){
            root.left.val=2*root.val+1;
        }
        if(root.right!=null){
            root.right.val=2*root.val+2;
        }
        recover(root.left);
        recover(root.right);
    }
    public boolean find(int target) {
        return solve(tmp,target);
    }
    public boolean solve(TreeNode root,int target){
        if(root==null) return false;
        if(root.val==target) return true;
        if(root.val>target) return false;
        boolean left=false,right=false;
        left=solve(root.left,target);
        right=solve(root.right,target);
        return left || right;
    }
}
