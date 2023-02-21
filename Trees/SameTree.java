package Trees;
public class SameTree {
    public boolean isSameTree(Node p, Node q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.data!=q.data){
            return false;
        }
        boolean left=isSameTree(p.left,q.left);
        boolean right=isSameTree(p.right,q.right);
        if(left==true && right==true){
        return true;
        }
        return false;
      
    }
}
