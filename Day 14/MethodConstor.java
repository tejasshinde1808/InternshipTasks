class Test{
    static void show(){
        System.out.println("Tejas's method");
    }
}
interface myInterface{
    Test get();
}
public class MethodConstor{
    public static void main(String[] args) {
        myInterface m = Test::new;
        m.get();
    }
}