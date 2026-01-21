import java.util.LinkedList;
public class LinkedlistEx {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);

        list.add("y");
        System.out.println(list);

        list.addFirst("T");
        System.out.println(list);

        list.addLast("s");
        System.out.println(list);

        System.out.println(list.get(4));
        
        list.remove(4);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }
}
