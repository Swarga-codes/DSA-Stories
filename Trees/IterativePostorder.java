package Trees;
import java.util.*;
public class IterativePostorder {
    public class Node{
        private int data;
        private Node left;
        private Node right;
        public Node(int key){
            this.data=key;
        }
    }
    public List<Integer> postorder(Node root){
        List<Integer> postorder=new ArrayList<>();
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
    if(root==null){
        return postorder;
    }
    st1.push(root);
    while(!st1.isEmpty()){
        root=st1.pop();
        st2.push(root);
        if(root.left!=null){
            st1.push(root.left);
        }
        if(root.right!=null){
            st1.push(root.right);
        }
    }
    while(!st2.isEmpty()){
        postorder.add(st2.pop().data);
    }
    return postorder;
    }
}
