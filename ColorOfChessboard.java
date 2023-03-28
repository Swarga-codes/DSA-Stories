public class ColorOfChessboard {
    public static void main(String[] args) {
        String coordinates="c8";
        System.out.println(squareIsWhite(coordinates));
    }
    public static boolean squareIsWhite(String coordinates) {
        char x=coordinates.charAt(0);
        char y=coordinates.charAt(1);
        
        if(((int)(x)%2!=0 && y%2!=0)||((int)(x)%2==0 && y%2==0)){
            return false;
        }
        return true;
     }
}
