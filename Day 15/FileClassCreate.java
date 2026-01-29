import java.io.File;

public class FileClassCreate{
    public static void main(String[] args)throws Exception {
        File f = new File("MyText");
        if(f.createNewFile())
            System.out.println("Created new file");
        else
            System.out.println("File already exists");
    }
}