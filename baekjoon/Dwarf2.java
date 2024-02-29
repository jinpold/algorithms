package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Dwarf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 20 7 23 19 10 15 25 8 13

        //난쟁이 9명(키)를 배열과 forloop를 활용해서 sum에 담아준다.
        int[] dwarf2 = new int[9];
        int sum = 0;

        for (int i = 0; i < dwarf2.length; i++) {
            dwarf2[i] = sc.nextInt();
            sum += dwarf2[i];
        }
        //오름차순 정렬
        Arrays.sort(dwarf2);

        // 가짜 난쟁이 찾기 위해 -> 변수 선언
        int fake1 = 0; int fake2 = 0;

        // 문제에서 7명의 키 합이 100이라고 했다.
        // 9명 총합이 140 - 2명 = 7명 (100)
        // 난쟁이 키 합산이 100을 넘는 난쟁이를 for문을 통해 fake에 담는다.
        for (int a = 0; a < dwarf2.length; a++) {
            for (int b = a + 1; b < dwarf2.length - 1; b++) {
                if (sum - dwarf2[b] - dwarf2[a] == 100) {
                    fake1 = dwarf2[a];
                    fake2 = dwarf2[b];
                }
            }
        }
        //진짜 난쟁이 -> j값이 fake1,2 와 같지 않으면 진짜 난쟁이
        for (int j = 0; j < dwarf2.length; j++) {
            if (j != fake2 && j != fake1 ) {
                System.out.println(dwarf2[j]+ " ");
            }
        }
    }
}
