public class LambdaThread {
    public static void main(String[] args) {
        Runnable r=()-> System.out.println("Thread Class");
        new Thread(r).start();
    }
    
}
