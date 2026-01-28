import java.util.*;
public class StreamUpperToLower {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("TEJAS");
        list.stream()
            .map(String::toLowerCase)
            .forEach(System.out::println);

    }
}
