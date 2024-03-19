package basic;
import java.util.Scanner;
public class DiceGame2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 주사위 눈 입력 받기
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();

        int prize = calculatePrize(dice1, dice2, dice3);

        // 계산된 상금 출력
        System.out.println(prize);

        scanner.close();
    }

    private static int calculatePrize(int dice1, int dice2, int dice3) {
        if (dice1 == dice2 && dice2 == dice3) {
            // 모든 눈이 같은 경우
            return 10000 + dice1 * 1000;
        } else if (dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
            // 두 눈이 같은 경우
            int sameEye = dice1 == dice2 ? dice1 : (dice1 == dice3 ? dice1 : dice2);
            return 1000 + sameEye * 100;
        } else {
            // 모든 눈이 다른 경우
            int maxEye = Math.max(dice1, Math.max(dice2, dice3));
            return maxEye * 100;
        }
    }
}