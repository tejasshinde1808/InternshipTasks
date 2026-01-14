class Superkeyword{
    Superkeyword(){
        System.out.println("superkeyword constructor");
    }
}
class Superkeyword2 extends Superkeyword{
    Superkeywords2(){
        super();
        System.out.println("superkeyword2 constructor");
    }
    public static void main(String args[]){
        Superkeyword2 s=new Superkeyword2();
    }
}