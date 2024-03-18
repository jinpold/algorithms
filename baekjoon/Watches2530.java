package baekjoon;

/*KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다.
인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다.
그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 초 단위로 자동적으로 계산한다.
또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 초 단위로 주어졌을 때,
오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.

첫째 줄에는 현재 시각이 나온다.
현재 시각은 시 A (0 ≤ A ≤ 23), 분 B (0 ≤ B ≤ 59)와 초 C (0 ≤ C ≤ 59)가
정수로 빈칸을 사이에 두고 순서대로 주어진다.
두 번째 줄에는 요리하는 데 필요한 시간 D (0 ≤ D ≤ 500,000)가 초 단위로 주어진다.
 */
import java.util.Scanner;
public class Watches2530 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 현재 시각 입력 받기
            int hours = sc.nextInt();
            int minutes = sc.nextInt();
            int seconds = sc.nextInt();

            // 요리하는 데 필요한 시간(초 단위) 입력 받기
            int time = sc.nextInt();

            // 요리하는 데 필요한 시간을 현재 시각에 더하기
            seconds += time;

            // 초, 분, 시간을 각각 계산
            minutes += seconds / 60;
            seconds %= 60;

            hours += minutes / 60;
            minutes %= 60;

            hours %= 24; // 24시간을 넘어가면 0으로 초기화

            System.out.println(hours + " " + minutes + " " + seconds);
        }
    }



