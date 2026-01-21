import java.util.*;
public class LinkedHashSetEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> a = new LinkedHashSet<>();
        System.out.println("Enter your array size ");
        int n =sc.nextInt();
        System.out.println("Enter your array element");
        for(int i = 0;i < n;i++)
            a.add(sc.nextInt());
        System.out.println(a);
    }    
}
