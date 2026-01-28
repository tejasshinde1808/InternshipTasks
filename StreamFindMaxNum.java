import java.util.*;

public class StreamFindMaxNum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,8,3,9,2,7,1);
        int max = nums.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
