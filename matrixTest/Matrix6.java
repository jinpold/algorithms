package matrixTest;

//25 20 15 10 5
//24 19 14 9 4
//23 18 13 8 3
//22 17 12 7 2
//21 16 11 6 1

public class Matrix6 {

    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int k = 25;
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                mtx[i][j] = k;
                k--;
            }
        }
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[j][i] + "");
            }
            System.out.println();
        }
    }
}
