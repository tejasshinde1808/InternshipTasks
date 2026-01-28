class Test{
    static void show(){
        System.out.println("Tejas Class");
    }
}
public class MethodStatic {
    public static void main(String[] args) {
        Runnable a = Test::show;
        a.run();
    }    
}
