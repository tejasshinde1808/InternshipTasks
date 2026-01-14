class Employee{
    int id;
    String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    void show(){
        System.out.println(id+ " " + name );
    }
    public static void main(String args[]){
        Employee e = new Employee(101,"Tejas");
        e.show();
    }
}