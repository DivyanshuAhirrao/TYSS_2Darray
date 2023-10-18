package twoDArray;

public class AddArray {
    public static void main(String[] args) {


        int[][] ar1 = {{1, 6, 3}, {8, 4, 2}};
        int[][] ar2 = {{9, 5, 2}, {3, 6, 7}};

        for (int r=0; r<ar1.length; r++) {
            for (int c=0;c<ar1[r].length;c++){
                System.out.print(ar1[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        for (int r=0; r<ar2.length; r++) {
            for (int c=0;c<ar2[r].length;c++){
                System.out.print(ar2[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("********************");
        System.out.println();
        for (int r=0; r<ar1.length; r++) {
            for (int c=0;c<ar1[r].length;c++){
                System.out.print(ar1[r][c]+ar2[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("********************");
    }
}
