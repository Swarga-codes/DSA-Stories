public class StrongPasswordChecker2 {
    public static void main(String[] args) {
        String password="Me+You--IsMyDream";
        System.out.println(strongPasswordCheckerII(password));
    }
    public static boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        int lower=0,upper=0,digit=0,special=0;
        for(int i=0;i<password.length();i++){
            if(i>0 && (password.charAt(i)==password.charAt(i-1))){
                return false;
            }
            if(password.charAt(i)>='a' && password.charAt(i)<='z'){
                lower++;
            }
            else if(password.charAt(i)>='A' && password.charAt(i)<='Z'){
                upper++;
            }
            else if(password.charAt(i)>='0' && password.charAt(i)<='9'){
                digit++;
            }
            else{
                special++;
            }
        }
        if(lower==0 || upper==0 || digit==0 || special==0) return false;
        return true;
    }
}

