package matrixTest;

import java.util.Scanner;

//1 2 3 4 5
//6 7 8 9 10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25




public class Matrix1 {
    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int k = 1;
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                mtx[i][j] = k;
                k++;
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
