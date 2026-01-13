class MultiMethod {
    int add(int a,int b){
        return (a+b);
    }
    double add(double a,double b){
        return(a+b);
    }
    public static void main(String[] args) {
        MultiMethod m=new MultiMethod();
        System.out.println(m.add(12,24));
        System.out.println(m.add(1.2,2.4));
    }
}
