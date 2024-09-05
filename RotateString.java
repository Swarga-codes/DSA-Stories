class RotateString{
    public static void main(String[] args) {
        String s="abcde",goal="bcdea";
        System.out.println(rotateString(s, goal));
    }
    public static boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
         String shifter=s.substring(i)+s.substring(0,i);
         if(shifter.equals(goal)){
             return true;
         }
        }
        return false;
     }
}