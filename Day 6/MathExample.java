//Compile-Time Polymorphism Using Method Overloading
class MathExample {
    int add(int a,int b){
        return a + b;
    }    
    int add(int a,int b,int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        MathExample m = new MathExample();
        System.out.println("Addtion of two numbers - "+m.add(2,3));
        System.out.println("Addtion of three numbers - "+m.add(4,5,6));
    }
}
