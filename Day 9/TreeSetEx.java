import java.util.Scanner;
import java.util.TreeSet;  // using for sort set

public class TreeSetEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> a = new TreeSet<>();
        System.out.println("Enter your size of array");
        int n = sc.nextInt();
        System.out.println("Enter element of your array");
        for(int i = 0;i < n;i++)
            a.add(sc.nextInt());
        System.out.println(a);
    }
}
