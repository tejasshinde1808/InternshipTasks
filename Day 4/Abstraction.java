abstract class shape{
    abstract void draw();
}
class Circle extends shape{
    void draw(){
        System.out.println("Draw circle");
    }

    public static void main(String args[]){
        Shape s = new Circle();
        s.draw();
    }
}