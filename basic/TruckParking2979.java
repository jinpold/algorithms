package basic;
import java.util.Scanner;

public class TruckParking2979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 주차 요금 입력
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 시간별 주차 트럭 수를 담을 배열
        int[] parkingTime = new int[101];

        // 트럭 주차 시간 입력 및 계산
        for (int i = 0; i < 3; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int j = start; j < end; j++) {
                parkingTime[j]++;
            }
        }

        // 총 주차 요금 계산
        int totalCost = 0;
        for (int i = 1; i < 101; i++) {
            if (parkingTime[i] == 1) {
                totalCost += A;
            } else if (parkingTime[i] == 2) {
                totalCost += B * 2;
            } else if (parkingTime[i] == 3) {
                totalCost += C * 3;
            }
        }

        System.out.println(totalCost);
        sc.close();
    }
}
