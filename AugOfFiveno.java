import java.util.Scanner;

public class AugOfFiveno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int number;
        System.out.println("Enter your 5 number");
            for(int i=0;i<=5;i++){
                number=sc.nextInt();
                sum=sum+number;
            }
        double average=sum/5.0;
        System.out.println("Your Avarage"+ average);
        sc.close();
        
    }
}
