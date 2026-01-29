import java.io.Serializable;

public class Student implements Serializable {

    int id;
    String name;
    int pin;

    Student(int id, String name, int pin) {
        this.id = id;
        this.name = name;
        this.pin = pin;
    }
}
