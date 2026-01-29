import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWrite {
    public static void main(String[] args) throws IOException{
        FileOutputStream f = new FileOutputStream("byte.txt");
        String data = "This is stream";
        f.write(data.getBytes());
        f.close();
        System.out.println("Strem file");
    }
}
