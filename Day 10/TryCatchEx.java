public class TryCatchEx {
    public static void main(String[] args) {
        try {
            int a = 10/0; // risky code
        } catch (Exception e) {
            System.out.println("cannot divided by 0"); // handling code
        }
    }    
}
