public class SumOfArray {
    public static void main(String[] args) {
        int[] a = {45,67,2,9,56,}; 
        int sum = 0;

        for(int i=0;i<a.length;i++)
            sum+=a[i];
        System.out.println("sum = "+ sum);
    }
}
