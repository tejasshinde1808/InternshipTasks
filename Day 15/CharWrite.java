import java.io.FileWriter;

public class CharWrite {
    public static void main(String[] args) throws Exception{
        FileWriter f = new FileWriter("Char.txt");
        f.write("java Charater Stream");
        f.close();

        System.out.println("text using charater Stream");
    }
}
