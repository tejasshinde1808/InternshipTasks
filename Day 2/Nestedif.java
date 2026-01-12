public class Nestedif {
    public static void main(String[] args) {
        int a = 5,b = 7, c = 9;
        if (a > b) {
            if (a > c)
                System.out.println("A is largest");
            else
                System.out.println("C is largest");
        } else {
            if (b > c)
                System.out.println("B is largest");
            else
                System.out.println("C is largest");
        }
        
    }
}
