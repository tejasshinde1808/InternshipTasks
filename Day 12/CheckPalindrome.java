// Write a program to check whether a given string or number is a palindrome.
public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        String r = "";
        for(int i=s.length()-1;i>=0;i--)
            r=r+s.charAt(i);
        System.out.println(r);
        if(s.equals(r))
            System.out.println("This string is palindrome");
        else
            System.out.println("This is not palindrome");
    }
}
