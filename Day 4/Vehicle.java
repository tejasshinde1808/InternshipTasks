class Vehicle{
    void run(){
        System.out.println("this is vehicle");
    }
}
class B extends Vehicle{
    public static void main(String args[]){
        B b = new B();
        b.run();
    }
}