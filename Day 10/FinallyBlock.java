public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int a = 10/2;
            System.out.println("a");
        }
        catch(Exception e){
            System.out.println("error");
        }
        finally{
            System.out.println("This is finally block");
        }
    }
}