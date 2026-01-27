public class TryCatchEx {
    public static void main(String[] args) {
        int a = 67;
        int b = 0;
        try {
            int c = a/b; // risky code
        } catch (Exception e) {
            System.out.println("cannot divided by 0"); // handling code
        }
    }    
}
