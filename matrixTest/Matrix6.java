package matrixTest;

//25 20 15 10 5
//24 19 14 9 4
//23 18 13 8 3
//22 17 12 7 2
//21 16 11 6 1

public class Matrix6 {

    public static void main(String[] args) {

        int[][] mtx = new int[10][10];

        for (int i = 1; i < mtx.length; i++) {
            for (int j = 2; j < mtx.length; j++) {
                mtx[i][j] = i * j;
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
