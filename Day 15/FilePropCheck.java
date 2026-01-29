import java.io.File;
public class FilePropCheck {
    public static void main(String[] args) {
        File f = new File("My Folder");
        System.out.println("File Name : "+f.getName());
        System.out.println("Path : "+f.getAbsolutePath());
        System.out.println("Size : "+f.length());
        System.out.println("Readable : "+f.canRead());
        System.out.println("Writable : "+f.canWrite());
        System.out.println("Executable : "+f.canExecute());
    }
}
