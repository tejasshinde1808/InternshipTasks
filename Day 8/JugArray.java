public class JugArray{
    public static void main(String[] args) {
        int[][] jug = {
            {1,2},
            {3,4,5},
            {6,7}
        };

        for(int i=0;i<jug.length;i++)
            for(int j=0;j<jug[i].length;j++)

                System.out.println(jug[i][j]+" ");

        System.out.println();

    }
}