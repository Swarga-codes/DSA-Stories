package Trees;

public class CheckBalancedBinaryTree {
    public class Node{
        private int data;
        private Node left;
        private Node right;
        public Node(int key){
            this.data=key;
        }
    }
    public boolean isBalanced(Node root){
        if(height(root)!=-1){
            return true;
        }
        else{
            return false;
        }
    }
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
       if(left==-1 || right==-1){
        return -1;
       }
       if(Math.abs(left-right)>1){
        return -1;
       }
       return 1+Math.max(left, right);
    }
}
