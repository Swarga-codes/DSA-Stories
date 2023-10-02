public class RemoveColoredPiecesIfBothNeighborsAreTheSameColor {
    public static void main(String[] args) {
       String colors = "AAABABB";
       System.out.println(winnerOfGame(colors)); 
    }
    public static boolean winnerOfGame(String colors) {
        int alicePoints=0,bobPoints=0;
        for(int i=1;i<colors.length()-1;i++){
            if(colors.charAt(i)=='A' && colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A'){
                alicePoints++;
            }
            else if(colors.charAt(i)=='B' && colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B'){
                bobPoints++;
            }
        }
        return alicePoints>bobPoints;
    }
}
