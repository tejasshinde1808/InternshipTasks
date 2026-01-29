import java.io.File;

public class FileMakeDir {
    public static void main(String[] args) {
        File f = new File("my dir");
        if(f.mkdir())
            System.out.println("Directory created");
        else
            System.out.println("Directory already created");
    }
}
