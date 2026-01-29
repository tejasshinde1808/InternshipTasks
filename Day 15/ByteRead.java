import java.io.FileInputStream;
public class ByteRead {
    public static void main(String[] args) throws Exception{
        FileInputStream f = new FileInputStream("Byte.Txt");
        int i;
        while((i=f.read()) != -1){
            System.out.println((char) i);
        }
        f.close();
    }
}