//Write a Java program to print Fibonacci series up to N numbers.
public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        int c;
        System.out.println(a+" "+b);
        for(int i = 0;i<=10;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
