public class StackMemory {
    static void  method1(){
        int a = 10;
        method2();
    }
    static void method2(){
        int b = 20;
        System.out.println(b);
    }
    public static void main(String[] args) {
        method1();
    }
}
