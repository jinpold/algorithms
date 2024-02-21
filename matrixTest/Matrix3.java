package matrixTest;

//5 4 3 2 1
//10 9 8 7 6
//15 14 13 12 11
//20 19 18 17 16
//25 24 23 22 21

public class Matrix3 {
    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int k = 5;
        for (int i = 0; i < mtx.length; i++) {    //set
            for (int j = 0; j < mtx[i].length; j++) {
                mtx[i][j] = k;
                k--;
            }
            k+=10;

        }
        for (int i = 0; i < mtx.length; i++) { //get
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }
}
