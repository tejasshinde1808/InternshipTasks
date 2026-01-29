import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
public class SerializeEx {
    public static void main(String[] args) throws Exception{
        Student s =new Student(1,"Tejas",1234);
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("Student.ser"));
        o.writeObject(s);
        o.close();
        System.out.println("Serialize object");
    }
}
