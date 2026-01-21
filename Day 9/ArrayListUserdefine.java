import java.util.*;
public class ArrayListUserdefine {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        
        System.out.print("Enter numbers of element ");
        int n = sc.nextInt();
        
        System.out.println("Enter your elements");
        for(int i = 0;i<n;i++)
            a.add(sc.nextInt());
        
        System.out.println(a);
    }
}