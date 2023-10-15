import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "color", ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
     public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx=ruleKeyIndex(ruleKey);
        int k=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(idx).equals(ruleValue)){
                k++;
            }
        }
        return k;
    }
    public static int ruleKeyIndex(String ruleKey){
        if(ruleKey.equals("type")){
            return 0;
        }
        else if(ruleKey.equals("color")){
            return 1;
        }
        return 2;
    }
}
