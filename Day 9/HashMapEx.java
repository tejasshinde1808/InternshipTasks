import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        System.out.println(map);
        System.out.println(map.get(3));
    }
}
