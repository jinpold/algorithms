package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Dwarf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dwarf2 = new int[9];
        int sum = 0;

        for (int i = 0; i < dwarf2.length; i++) {
            dwarf2[i] = sc.nextInt();
            sum += dwarf2[i];
        }

        Arrays.sort(dwarf2);

        int fake1 = 0; int fake2 = 0;

        for (int a = 0; a < dwarf2.length; a++) {
            for (int b = a + 1; b < dwarf2.length - 1; b++) {
                if (sum - dwarf2[b] - dwarf2[a] == 100) {
                    fake1 = dwarf2[a];
                    fake2 = dwarf2[b];
                }
            }
        }
        //진짜 난쟁이
        for (int j = 0; j < dwarf2.length; j++) {
            if (j != fake2 && j != fake1 ) {
                System.out.println(dwarf2[j]+ " ");
            }
        }

    }
}
