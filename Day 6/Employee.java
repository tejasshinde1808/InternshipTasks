final class Employee{
    private final int id;
    private final String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String geName(){
        return name;
    }
    public static void main(String[] args) {
        Employee e = new Employee(201,"Tejas");
        System.out.println("Id " + e.getId());
        System.out.println("Name " + e.geName());
    }
}
