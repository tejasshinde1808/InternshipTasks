// Write a program to check whether a given number is prime.

import java.util.Scanner;

public class CheckPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        int temp = 0;
        for(int i = 1;i<=a;i++){
            if(a%i==0){
                temp++;
            }
        }
        if(temp==2){
            System.out.println("Number is prime number- "+a);
        }
        else{
            System.out.println("Number is not a prime number = "+a);
        }
    }
}