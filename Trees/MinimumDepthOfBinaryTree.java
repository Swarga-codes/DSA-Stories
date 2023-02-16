package Trees;

public class MinimumDepthOfBinaryTree {
    public int minDepth(Node root) {
        if(root==null){
            return 0;
        }   
           if(root.left==null && root.right==null){
               return 1;
           }
           if(root.left==null){
               return 1+minDepth(root.right);
           }
            if(root.right==null){
               return 1+minDepth(root.left);
           }
           int right=minDepth(root.right);
           int left=minDepth(root.left);
           
           return 1+Math.min(left,right);
       }
}
