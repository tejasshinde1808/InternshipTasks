class MStudent {
    int id;
    String name;

    MStudent(){
        id=0;
        name="unknow";
    }
    MStudent(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        MStudent s1 = new MStudent();
        MStudent s2 = new MStudent(101,"Tejas");
        s1.display();
        s2.display();
    }
}
