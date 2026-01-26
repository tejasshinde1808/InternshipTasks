// Write a Java program to calculate factorial of a number using recursion.
class FindFactorialNum {
    static int fact=1;
    public static void main(String[] args) {
        int n=5;
        FindFactorialNum fb = new FindFactorialNum();
        fb.calFact(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }
    void calFact(int n)
    {
        if(n>=1){
            fact=fact*n;
            calFact(n-1);
        }
    } 
}
