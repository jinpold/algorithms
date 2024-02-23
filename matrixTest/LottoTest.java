package matrixTest;

import java.util.Arrays;

public class LottoTest {

    public static void main(String[] args) {
        //2. 각 숫자는 1~45 범위 내의 숫자

        int[] lotto = new int[6];

        //로또번호생성
        for (int i = 0; i < lotto.length; i++) {
            System.out.println();
            System.out.println();
            System.out.println(i + 1 + " 번째 뽑기 시작.....");
            lotto[i] = (int) (Math.random() * 44) + 1; // 랜덤수 생성
            System.out.println(i + 1 + " 번째 번호는 : " + lotto[i] + " 입니다.");

            System.out.println("================================");

            //중복제거
            for (int j = 0; j < i; j++) {
                System.out.println(i + 1 + " 번째 랜덤 번호 " + lotto[i] + " 와 " + lotto[j] + " 를 비교하는 중 입니다...");
                if (lotto[j] == lotto[i]) {
                    System.out.print("********중복***********  " + (i + 1) + " 번째 숫자와 " + (j + 1) + " 번째 숫자와 같습니다.");
                    i--; // 중복되면 확인하고 i 차감
                }
            }
        }
        Arrays.sort(lotto); // 오름차순 정렬
        System.out.println();
        System.out.println();
        System.out.print("로또 당첨 번호는 [ ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println("]  입니다.");
    }
}
