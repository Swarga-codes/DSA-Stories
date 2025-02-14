import java.util.ArrayList;
import java.util.List;

public class ProductOfLastKNumbers {
    public class ProductOfNumbers {
    List<Integer> prodList;
    int idx=-1;
    int prod=1;
    public ProductOfNumbers() {
        prodList=new ArrayList<>();
    }
    
    public void add(int num) {
        if(num==0){
            prod=1;
            idx=prodList.size();
            prodList.add(num);
        }
        else{
            prod*=num;
            prodList.add(prod);
        }
    }
    
    public int getProduct(int k) {
        int n=prodList.size();
        if(idx>n-k-1) return 0;
        if(idx==n-k-1) return prod;
        return prodList.get(n-1)/prodList.get(n-k-1);
    }
}
}
