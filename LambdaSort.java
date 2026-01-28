import java.util.*;
public class LambdaSort {
    public static void main(String[] args) {
        List<String> name=Arrays.asList("A","D","N","U","B","D");
        Collections.sort(name,(a,b) -> a.compareTo(b));
        System.out.println(name);
    }
    
}
