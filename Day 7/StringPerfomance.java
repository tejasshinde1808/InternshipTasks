// print even number in string.
class StringPerfomance {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<=100;i++){
            if (i%2==0) 
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb);
    }    
}
