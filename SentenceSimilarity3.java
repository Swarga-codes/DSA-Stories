class SentenceSimilarity3{
    public static void main(String[] args){
        String sentence1="Hello Jane",sentence2="Hello my name is Jane";
        System.out.println(areSentencesSimilar(sentence1, sentence2));
    }
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()<sentence2.length()){
            return checkHelper(sentence1,sentence2);
        }
        return checkHelper(sentence2,sentence1);
    }
    public static boolean checkHelper(String s,String p){
    String[] shortArr=s.split(" ");
    String[] longArr=p.split(" ");
    int i=0;
    while(i<shortArr.length && i<longArr.length && shortArr[i].equals(longArr[i])){
        i++;
    }
    
    int j=shortArr.length-1,k=longArr.length-1;
    while(j>=0 && shortArr[j].equals(longArr[k])){
        j--;
        k--;
        
    }
    return j<i;
    }
}