class Student{
    private int id;
    private String name;

    private void setId(int id){
        this.id=id;
    }
    private void setName(String name){
        this.name=name;
    }
    public void display(){
        System.out.println(" id :" + id +", Name : " + name);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(101);
        s.setName("Tejas");
        s.display();
    }
}