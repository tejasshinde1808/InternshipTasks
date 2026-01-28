interface add{
    int sum(int a,int b);
}
public class LambdaSum {
    public static void main(String[] args) {
        add a = (x,y)-> x+y;
        System.out.println(a.sum(10,20));
    }
} 
