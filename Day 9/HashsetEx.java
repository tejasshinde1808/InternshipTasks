import java.util.ArrayList;
import java.util.HashSet;  // hashset does not allow duplicates.

public class HashsetEx { 
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(11);
        a.add(10);
        a.add(15);
        a.add(20);
        a.add(19);

        System.out.println(a);

        HashSet<Integer> set = new HashSet<>(a);
        System.out.println(set);
    }   
}
