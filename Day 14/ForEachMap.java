import java.util.*;

public class ForEachMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Tejas");
        map.put(2,"Shinde");
        map.forEach((k,v) -> System.out.println(k+ " "+v));
    }
}
