import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteCopy {
    public static void main(String[] args) throws IOException{
        
        FileInputStream fi = new FileInputStream("byte.txt");
        FileOutputStream fo = new FileOutputStream("copy.txt");

        int i;
        while ((i=fi.read()) != -1) {
            fo.write(i);
        }
        fi.close();
        fo.close();
        System.out.println("file copied");
    }
}
