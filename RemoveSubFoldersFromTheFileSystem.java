import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFoldersFromTheFileSystem {
    public static void main(String[] args) {
        String[] folder={"/a/b/c","/a/b/ca","/a/b/d"};
        System.out.println(removeSubfolders(folder));
    }
      public static List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> res=new ArrayList<>();
        String curr=folder[0];
        res.add(curr);
        for(int i=1;i<folder.length;i++){
            if(folder[i].startsWith(curr+"/")){
                continue;
            }
            else{
                curr=folder[i];
                res.add(curr);
            }
        }
        return res;
    }
}
