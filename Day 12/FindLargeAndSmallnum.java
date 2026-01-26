// Write a program to find the largest and smallest number in an array.
public class FindLargeAndSmallnum {
    public static void main(String[] args) {
        int a[]={2,4,5,6,7,8,5,4,9,1,6};
        int large = a[0];
        int small = a[0];
        for(int i = 0;i<a.length;i++){
            if(a[i]>large)
                large=a[i];

            if(a[i]<small)
                small=a[i];
        }
        System.out.println("Large Number "+large);
        System.out.println("Small Number "+small);
    }
}
