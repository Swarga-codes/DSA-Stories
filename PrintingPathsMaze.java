import java.util.ArrayList;

public class PrintingPathsMaze {
    public static void main(String[] args) {
        PrintPath("", 3, 3);
        System.out.println(PrintPathList("", 3, 3));
    }
    static void PrintPath(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(c>1){
        PrintPath(p+"R", r, c-1);
        }
        if(r>1){
        PrintPath(p+"D", r-1, c);
    }
    }
    //Using ArrayList
 static ArrayList<String> PrintPathList(String p,int r,int c){
    if(r==1 && c==1){
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;
    }
    ArrayList<String> list=new ArrayList<>();
  if(r>1){
    list.addAll(PrintPathList(p+"D",r-1,c));
  }
  if(c>1){
list.addAll(PrintPathList(p+"R", r, c-1));
  }
  return list;
 }
}
