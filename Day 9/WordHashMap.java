import java.util.HashMap;

public class WordHashMap {
    public static void main(String[] args) {
        String[] a = {"ABCD","QWER","LKJH","MNBV"};
        HashMap<String,Integer> map = new HashMap<>();
        for (String word:a)
            map.put(word,map.getOrDefault(word,0)+1);
        System.out.println(map);
    }    
}
