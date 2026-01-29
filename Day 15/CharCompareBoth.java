import java.util.*;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class CharCompareBoth {
    public static void main(String[] args) throws Exception{
        new FileOutputStream("byte2.txt").write("Hello".getBytes());
        new FileWriter("char2.txt").write("Hello");
        System.out.println("write using both");
    }
}
