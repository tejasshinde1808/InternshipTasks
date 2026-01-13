class Method_Calculator {
    //int add(int a,int b){
    //    return a+b;}
    int sub(int a,int b){
        return a-b;
    }    
    public static void main(String[] args) {
        Method_Calculator c=new Method_Calculator();
        System.out.println(c.sub(10,20));
        System.out.println(c.sub(1,2));
        System.out.println(c.sub(9,8));
        System.out.println(c.sub(897,657));
    }
}