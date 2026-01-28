class Test{
    static void show(){
        System.out.println("Tejas's Method");
    }
}
public class MethodInstance {
    public static void main(String[] args) {
        Test t = new Test();
        Runnable r = Test::show;
        r.run();;
    }
    
}
