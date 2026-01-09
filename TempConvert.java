import java.util.Scanner;

class TempConvert {
    static void celsiusToFahrenheit(double c){
        double f = (c * 9 / 5) + 32;
        System.out.println("Fahrenheit = "+f);
    }
    static void fahrenheitToCelsius(double f){
        double c = (f - 32)* 5/9;
        System.out.println("Celsius = "+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for celsius to fahrenheit");
        System.out.println("Enter 2 for fahrenheit to celsis");
        int choice = sc.nextInt();
         if (choice == 1) {
            System.out.print("Enter Celsius value: ");
            double c = sc.nextDouble();
            celsiusToFahrenheit(c);
        } 
        else if (choice == 2) {
            System.out.print("Enter Fahrenheit value: ");
            double f = sc.nextDouble();
            fahrenheitToCelsius(f);
        } 
        else {
            System.out.println("Wrong choice");
        }

        sc.close();
        
    }
}
