package matrixTest;

//25 24 23 22 21
//20 19 18 17 16
//15 14 13 12 11
//10 9 8 7 6
//5 4 3 2 1

public class Matrix2 {
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
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }
}
