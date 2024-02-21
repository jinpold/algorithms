package matrixTest;

//1 2 3 4 5
//10 9 8 7 6
//11 12 13 14 15
//20 19 18 17 16
//21 22 23 24 25

public class Matrix5 {
        public static void main(String[] args) {
            int[][] arr = new int[5][5];
            int k =1;
            for (int i = 0; i < arr.length; i++) {
                if (i%2 == 0 ){
                    for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j] = k;
                        k++;
                    }} else {
                    for (int j = arr.length-1; j >= 0 ; j--) {
                        arr[i][j] = k;
                        k++;
                    }}
            }
            // ^set 값을 바꿔주기만함
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            // ^get 값을 프린트만함
        }
}