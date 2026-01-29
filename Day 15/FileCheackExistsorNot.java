import java.io.File;
public class FileCheackExistsorNot{
    public static void main(String[] args)throws Exception {
        File f = new File("my text");
        if(f.exists())
            System.out.println("File Exists");
        else
            System.out.println("File does not exists");
    }
}