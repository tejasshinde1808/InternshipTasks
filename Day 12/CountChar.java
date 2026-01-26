// Write a Java program to count occurrences of each character in a string.
import java.util.*;

public class CountChar {
    public static void main(String[] args) {
        String s = "tejas shinde";
        HashMap <Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        System.out.println(map);
    }
}
