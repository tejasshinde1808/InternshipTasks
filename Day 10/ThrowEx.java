public class ThrowEx {
    static void CheckAge(int age){
        if (age<18) {
            throw new ArithmeticException("not eligible");
        }
        System.out.println("Eligible");
    }
    public static void main(String[] args) {
        try{
            CheckAge(17);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}