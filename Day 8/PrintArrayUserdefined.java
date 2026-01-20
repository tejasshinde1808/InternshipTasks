import java.util.*;
public class PrintArrayUserdefined{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("Enter element of array");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        for(int i = 0;i<a.length;i++)
            System.out.print(a[i]+ " ");
    }
}