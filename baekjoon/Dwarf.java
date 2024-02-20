package baekjoon;

import java.io.*;
import java.util.*;

public class Dwarf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] dwarf = new int[9];
        int sum = 0;

        for (int i = 0; i < dwarf.length; i++) {
            dwarf[i] = sc.nextInt();
            sum += dwarf[i];
        }
        Arrays.sort(dwarf); //오름차순

        int fake1 = 0, fake2 = 0;

        for (int a = 0; a < dwarf.length - 1; a++) {
            for (int b = a + 1; b < dwarf.length; b++) {
                if (sum - dwarf[a] - dwarf[b] == 100) {
                    fake1 = a;
                    fake2 = b;
                    break;
                }
            }
        }
        for (int j = 0; j < dwarf.length; j++) {
            if (j != fake1 && j != fake2)
                continue;
            System.out.println(dwarf[j]);
        }
    }
}
