package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class dddddd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 20 7 23 19 10 15 25 8 13

        int[] ddd = new int[9];

        int sum = 0;

        for(int i =0; i < ddd.length; i++) {
            ddd[i] = sc.nextInt();
            sum += ddd[i];
        }

        Arrays.sort(ddd);

        int fake1 = 0;
        int fake2 = 0;

        for (int a = 0; a<ddd.length-1; a++) {
            for (int b = 0; b< ddd.length; b++) {
                 fake1 = ddd[a];
                 fake2 = ddd[b];
            }
        }

        for (int j = 0; j< ddd.length; j++) {
            if (ddd[j] != fake1 && ddd[j] != fake2){
                System.out.println(ddd[j]+ " ");
            }
        }
    }
}
