class Student{
    int id;
    String name;

    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String args[]){
        Student s1 = new Student();
        s1.id=23;
        s1.name="Tejas";
        s1.display();

    }
}