package matrixTest;

//1~45 랜덤수 뽑기 /6자리

import java.util.Arrays;

public class Lotto {

    public static void main(String[] args) {

        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {
            lotto[i] = (int) (Math.random() * 44) + 1;

            for (int j = 0; j < 6; j++) {
                if (lotto[j] == lotto[i]) {
                    lotto[i] = lotto[j];
                } else {

                    break;
                }
            }
        }
        for (int j = 0; j < 6; j++) {
            System.out.print(lotto[j]+ " ");
        }
        System.out.println();
    }
}
