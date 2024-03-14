package baekjoon;
import java.util.Scanner;
public class Score2506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            // 문제의 개수 N을 입력받음
        int N = sc.nextInt();
        int[] scores = new int[N];
            // 총 점수와 이전 문제의 점수를 저장할 변수를 초기화
        int totalScore = 0;
        int prevScore = 0;
            // 문제의 채점 결과를 입력받으면서 점수 계산
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
                // 문제의 답이 맞는 경우
            if (scores[i] == 1) {
                    // 연속된 정답의 경우, 이전 문제의 점수에 1을 더해줌
                    prevScore++;
                    // 총 점수에 가산
                    totalScore += prevScore;
            } else {
                    // 문제의 답이 틀린 경우, 이전 문제의 점수를 0으로 리셋
                    prevScore = 0;
            }
        }
        // 최종 총 점수 출력
        System.out.println(totalScore);
        sc.close();
    }
}

