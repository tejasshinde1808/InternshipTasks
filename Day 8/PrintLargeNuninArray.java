public class PrintLargeNuninArray {
    public static void main(String[] args) {
        int[] a = {23,45,67,87,34,67};
        int max = a[0];

        for(int i=0;i<a.length;i++)
            if(a[i]>max)
                max=a[i];

        System.out.println("Largest number is = "+max);
    }    
}
