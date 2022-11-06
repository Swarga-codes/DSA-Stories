package Trees;

public class DiameterOfABinaryTree {
    public class Node{
        private int data;
        private Node left;
        private Node right;
        public Node(int key){
            this.data=key;
        }
    }
    public int findDiameter(Node root){
    int[] diameter=new int[1];
    findMax(root, diameter);
    return diameter[0];
    }
    public int findMax(Node root,int[] diameter){
     if(root==null){
        return 0;
     }
     int left=findMax(root.left, diameter);
     int right=findMax(root.right, diameter);
    diameter[0]=Math.max(diameter[0], left+right);
    return 1+Math.max(left, right);
    }
}
