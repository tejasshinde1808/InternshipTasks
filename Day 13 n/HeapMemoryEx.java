class Student{
    int id=10;
}
public class HeapMemoryEx {
    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student();
        System.out.println(a.id);
        System.out.println(b.id);
    }
}
