package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTrees {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        public static int idx=-1;
        public static Node buildIt(int[] nodes){
           idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildIt(nodes);
            newNode.right=buildIt(nodes);
            return newNode;
        }
    }
public static void levelOrder(Node root){
    if(root==null){
        return;
    }
    Queue<Node> queue=new LinkedList<>();
    queue.add(root);
    queue.add(null);
    while(!queue.isEmpty()){
        Node currNode=queue.remove();
        if(currNode==null){
            System.out.println();
            if(queue.isEmpty()){
                break;
            }
            else{
                queue.add(null);
            }
        }
        else{
            System.out.print(currNode.data+" ");
            if(currNode.left!=null){
                queue.add(currNode.left);
            }
            if(currNode.right!=null){
                queue.add(currNode.right);
            }
        }
    }
}
//count the number of nodes
public static int NoOfNodes(Node root){
    if(root==null){
        return 0;
    }
    int left=NoOfNodes(root.left);
    int right=NoOfNodes(root.right);
    return left+right+1;
}
//Sum of nodes of the tree
public static int SumOfNodes(Node root){
    if(root==null){
        return 0;
    }
    int left=SumOfNodes(root.left);
    int right=SumOfNodes(root.right);
    return left+right+root.data;
}
//Height of the tree
public static int HeightOfTree(Node root){
    if(root==null){
        return 0;
    }
    int left=HeightOfTree(root.left);
    int right=HeightOfTree(root.right);
    return Math.max(left, right)+1;
}
//Diameter of tree
//O(N^2) solution
public static int DiameterOfTree(Node root){
    if(root==null){
        return 0;
    }
    int diam1=DiameterOfTree(root.left);
    int diam2=DiameterOfTree(root.right);
    int diam3=HeightOfTree(root.left)+HeightOfTree(root.right)+1;
    return Math.max(diam3,Math.max(diam1, diam2));
}
//Optimised solution using O(N) time complexity
static class TreeInfo{
     int height;
     int diameter;
     public TreeInfo(int h,int d){
        this.height=h;
        this.diameter=d;
     }
}
public static TreeInfo DiameterOfTreeOptimal(Node root){
    if(root==null){
        return new TreeInfo(0, 0);
    }
    TreeInfo left=DiameterOfTreeOptimal(root.left);
    TreeInfo right=DiameterOfTreeOptimal(root.right);
    int myHeight=Math.max(left.height, right.height)+1;
    int diam1=left.diameter;
    int diam2=right.diameter;
    int diam3=left.height+right.height+1;
    int myDiam=Math.max(diam3,Math.max(diam2, diam1));
    TreeInfo myResult=new TreeInfo(myHeight, myDiam);
    return myResult;
}
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildIt(nodes);
        System.out.println("The root of the tree is:");
        System.out.println(root.data);
        System.out.println("The level order traversal of the tree is:");
        levelOrder(root);
        System.out.println("The number of nodes of the tree is:");
        System.out.println(NoOfNodes(root));
        System.out.println("The sum of nodes of the tree is:");
        System.out.println(SumOfNodes(root));
        System.out.println("The height of the tree is:");
        System.out.println(HeightOfTree(root));
        System.out.println("The diameter of the tree is:");
        System.out.println(DiameterOfTree(root));
        System.out.println("The Optimised solution for the diameter of the tree is:");
        System.out.println(DiameterOfTreeOptimal(root).diameter);
    }
}
