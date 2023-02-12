public class FinalValueOfVariableOperations {
public static void main(String[] args) {
    String[] operations= {"--X","X++","X++"};
System.out.println(finalValueAfterOperations(operations));
}
    public static int finalValueAfterOperations(String[] operations) {
        int k=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                k++;
            }
            else{
                k--;
            }
        }
        return k;
    }
}
