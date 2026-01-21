import java.util.*;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        
        System.out.println(list);
        System.out.println(list.get(3)); 
        System.out.println(list.set(1,45)); 
        System.out.println(list.remove(4)); 
        System.out.println(list.size());
        System.out.println(list.contains(15));
        System.out.println(list.contains(28));
        list.clear();

        System.out.println(list);
    }
}
