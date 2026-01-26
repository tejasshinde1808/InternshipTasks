// Write a Java program to reverse a given string without using built-in reverse methods.
public class ReverseString {
    public static void main(String[] args) {
        String s = "Tejas Shinde";
        String r = " ";
        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        System.out.println(r);
    }
}
