public class MaximumNumberOfWordsInSentence {
    public static void main(String[] args) {
        String[] sentences={"Hello World","I am a good boy","Hey there!"};
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int[] k=new int[sentences.length];
        int count=0;
        int max=0;
       for(int i=0;i<sentences.length;i++){
           sentences[i]=' '+sentences[i];
           for(int j=0;j<sentences[i].length()-1;j++){
               if(sentences[i].charAt(j)==' ' && sentences[i].charAt(j+1)!=' '){
                   count++;
               }
           }
           k[i]=count;
           count=0;
       }
    max=maxCount(k);
    return max;
    }
    public static int maxCount(int[] k){
   int max=k[0];
       for(int i=0;i<k.length;i++){
           if(max<k[i]){
               max=k[i];
           }
       }
       return max;
    }
}
