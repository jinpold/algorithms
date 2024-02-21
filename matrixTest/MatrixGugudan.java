package matrixTest;

public class MatrixGugudan {
    public static void main(String[] args) {
        int[][] mtx = new int[10][10];

        for (int i = 1; i < mtx.length; i++) {
            for (int j = 2; j < mtx.length; j++) {
                mtx[i][j] = i * j;
                System.out.print(j+ "X" + i + "=" + mtx[i][j] + "\t");
            }
            System.out.println();
        }
    }
}