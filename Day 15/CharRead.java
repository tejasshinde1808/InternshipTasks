import java.io.FileReader;

public class CharRead {
    public static void main(String[] args) throws Exception{
        FileReader f = new FileReader("char.txt");
        int i;
        while((i=f.read())!= -1)
            System.out.println((char) i);
        f.close();
    }
}
