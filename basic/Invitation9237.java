package basic;
import java.util.Arrays;
import java.util.Scanner;

public class Invitation9237 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt(); // 나무 묘목의 수
            Integer[] trees = new Integer[N];

            for (int i = 0; i < N; i++) {
                trees[i] = scanner.nextInt();
            }

            // 나무가 자라는 데 걸리는 시간을 내림차순으로 정렬
            Arrays.sort(trees, (a, b) -> b - a);

            int day = 0;
            for (int i = 0; i < N; i++) {
                // 각 나무를 심는데 걸리는 총 시간 계산
                int totalDays = trees[i] + i + 1;
                if (day < totalDays) {
                    day = totalDays;
                }
            }

            // 마지막 나무가 다 자란 다음날 이장님을 초대
            System.out.println(day + 1);
        }
}

