public class ThrowsEx {
    static void divide() throws ArithmeticException{
        int a = 10/0;
    }
    public static void main(String[] args) {
        try{
            divide();
        } catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }
    }
}
