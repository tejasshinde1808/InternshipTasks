class Student {
    int id;
    String name;
    double marks;

    void display(){
        System.out.println("Student Id " + id);
        System.out.println("Student Name "+ name);
        System.out.println("Student marks "+ marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 29;
        s1.name = "Tejas";
        s1.marks = 89;

        s1.display();

        Student s2 = new Student();
        s2.id = 30;
        s2.name = "Shinde";
        s2.marks = 97;

        s2.display();

    }
}
