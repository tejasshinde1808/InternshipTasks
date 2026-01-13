class PrimitiveObject{
    static int size;
}
class Test{
    static void change(PrimitiveObject b){
        PrimitiveObject.size=20;
    }
    public static void main(String[] args) {
        PrimitiveObject box=new PrimitiveObject();
        PrimitiveObject.size=10;
        change(box);
        System.out.println(PrimitiveObject.size);
    }
}
