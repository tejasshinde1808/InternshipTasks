public class MultipalTryCatchEx {
    public static void main(String[] args) {
        try{
            int [] a = new int[3];
            a[5]=10;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error");
        }catch(Exception e){
            System.out.println("General exception");
        }
    }    
}
