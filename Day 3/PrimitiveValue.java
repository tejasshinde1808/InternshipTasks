class PrimitiveValue {
    static void change(int x){
        x=50;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a=10;
        change(a);
        System.out.println(a);
    }
}
