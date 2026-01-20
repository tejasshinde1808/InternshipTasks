import java.util.*;
public class SumofArrayUserdefine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter element of array");
        for(int i = 0;i<n;i++)
            a[i]=sc.nextInt();

        int sum = 0;
        for(int i = 0;i<a.length;i++)
            sum += a[i];

        System.out.println("sum of your array = "+sum);

    }
}