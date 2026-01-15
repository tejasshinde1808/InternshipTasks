class A{
    void showA(){
        System.out.println("Class A");
    }
}
class B extends A{
    void showB(){
        System.out.println("Class B");
    }
}
class C extends B{
    void showC(){
        System.out.println("Class c");
    }
    public static void main(String[] args) {
        C object = new C();
        object.showA();
        object.showB();
        object.showC();
    }
}