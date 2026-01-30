interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Square");
    }
}

class ShapeFactory {
    static Shape getShape(String type) {
        if (type.equals("circle"))
            return new Circle();
        else
            return new Square();
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        Shape s = ShapeFactory.getShape("circle");
        s.draw();
    }
}

