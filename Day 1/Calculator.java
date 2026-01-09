import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of A");
        int a=sc.nextInt();
        System.out.println("Enter value of B");
        int b=sc.nextInt();

        System.out.println("Enter your operator");
        char operator=sc.next().charAt(0);
        int result;
        switch (operator) {
            case '+':
                result=a+b;
                System.out.println("your answer = "+result);
                break;
            case '-':
                result=a-b;
                System.out.println("your answer = "+result);
                break;
            case '*':
                result=a*b;
                System.out.println("your answer = "+result);
                break;
            case '/':
                result=a/b;
                System.out.println("your answer = "+result);
                break;
            default:
                System.out.println("invalid operator");
                break;
        } 
    }
    
}
