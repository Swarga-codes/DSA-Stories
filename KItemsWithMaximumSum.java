public class KItemsWithMaximumSum {
    public static void main(String[] args) {
        int numOnes=6,numZeros=6,numNegOnes=6,k=13;
        System.out.println(kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k));
    }
    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k==numOnes || (k-numOnes>0 && k-numOnes<=numZeros)) return numOnes;
       if(k<numOnes) return k;
       return numOnes-(k-numOnes-numZeros);
    }
}
