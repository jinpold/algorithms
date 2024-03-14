package baekjoon;
import java.util.Scanner;

public class Exchange {

    public class MinimumSwaps {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine(); // 문자열 입력

            int result = minSwaps(str); // 최소 교환 회수 계산

            System.out.println(result); // 결과 출력
        }

        // 'a'를 모두 연속으로 만들기 위해 필요한 최소 교환 회수를 계산하는 함수
        public static int minSwaps(String str) {
            int n = str.length();
            int[] prefixSum = new int[n];
            int totalA = 0; // 문자열 내 'a'의 총 개수

            // prefixSum 배열 구하기
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'a')
                    totalA++;
                prefixSum[i] = totalA;
            }

            int minSwaps = n; // 초기 최소 교환 회수 설정

            // 각 위치에서 교환 회수 계산
            for (int i = 0; i < n; i++) {
                int swapsLeft = prefixSum[i]; // 왼쪽 영역에서 교환 필요한 횟수
                int swapsRight = totalA - swapsLeft; // 오른쪽 영역에서 교환 필요한 횟수
                int swaps = Math.min(swapsLeft, swapsRight); // 둘 중 작은 값 선택

                minSwaps = Math.min(minSwaps, swaps); // 최소 교환 회수 업데이트
            }

            return minSwaps;
        }
    }
}
