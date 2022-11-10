package Trees;

public class PathSum {
    public boolean hasPathSum(Node root, int targetSum) {
        if(root==null){
            return false;
        }
         if(root.left==null && root.right==null && targetSum-root.data==0){
             return true;
         }
         return hasPathSum(root.left,targetSum-root.data)|| hasPathSum(root.right,targetSum-root.data);
     }
}
