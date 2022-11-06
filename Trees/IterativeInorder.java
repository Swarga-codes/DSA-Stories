package Trees;
import java.util.*;
public class IterativeInorder {
    public class Node{
        private int data;
        private Node left;
        private Node right;
        public Node(int key){
            this.data=key;
        }
        }
        public List<Integer> inorder(Node root){
           List<Integer> inorder=new ArrayList<>();
           Stack<Node> st=new Stack<>();
           Node node=root;
           if(node==null){
            return inorder;
           }
           while(true){
           if(node!=null){
            st.push(node);
            node=node.left;
           }
           else{
            if(st.isEmpty()){
                break;
            }
            node=st.pop();
            inorder.add(node.data);
            node=node.right;
           }
        }
        return inorder;
        }
}
