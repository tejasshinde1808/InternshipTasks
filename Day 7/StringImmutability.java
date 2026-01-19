//String Immutability
class StringImmutability {
    public static void main(String[] args) {
        String s = "Tejas";
        System.out.println(s);
        s.concat("Shinde");
        System.out.println(s); // unchanged becasue string is immutable
    }
}
