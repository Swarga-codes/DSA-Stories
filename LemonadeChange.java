class LemonadeChange{
    public static void main(String[] args){
        int[] bills={5,5,5,20};
        System.out.println(lemonadeChange(bills));
        
    }
      public static boolean lemonadeChange(int[] bills) {
        int x=0,y=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                x++;
            }
            else if(bills[i]==10){
                if(x>0){
                    x--;
                    y++;
                }
                else{
                    return false;
                }
            }
            else{
                if(x>=1 && y>=1){
                    x--;
                    y--;
                }
                else if(x>=3){
                    x-=3;
                }
                
                else{
                    return false;
                }
            }
        }
        return true;
    }
}