package matrixTest;

//1 6 11 16 21
//2 7 12 17 22
//3 8 13 18 23
//4 9 14 19 24
//5 10 15 20 25

public class Matrix4 {
    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int k = 1;
        for (int i = 0; i < mtx.length; i++) {    //set
            for (int j = 0; j < mtx[i].length; j++) {
                mtx[i][j] = k;
                k++;

            }

        }
        for (int i = 0; i < mtx.length; i++) { //get
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[j][i] + " ");
            }
            System.out.println();
        }
    }
}
