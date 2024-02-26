package matrixTest;

import java.util.Arrays;

public class LottoMatching {
    public static void main(String[] args) {

        // 내 로또 번호 구하기
        int[] lotto = new int[6];
        lotto = createArrayWithoutDuplicate(lotto);
        lotto = sortAscending(lotto);
        System.out.println();
        System.out.println();

        // 나의 로또 번호 출력
        System.out.println("나의 로또 번호입니다.");
        printLotto(lotto);

        // 로또 당첨 번호 구하기
        int[] lotto2 = new int[6];
        lotto2 = createArrayWithoutDuplicate(lotto2);
        lotto2 = sortAscending(lotto2);
        System.out.println();
        // 로또 당첨 번호 출력
        System.out.println("로또 당첨 번호입니다.");
        printLotto(lotto2);




        // 번호 비교
        int num = 0;
        for (int i=0;i< lotto.length;i++){
            for(int j=0; j< lotto2.length;j++) {
                if (lotto[i] != lotto2[j]) {

                }else
                    num+=1;
            }
        }
        System.out.println();

        switch (num){
            case 6:
                System.out.println("1등");
                break;
            case 5:
                System.out.println("2등");
                break;
            case 4:
                System.out.println("3등");
                break;
            case 3:
                System.out.println("4등");
                break;
            case 2,1,0:
                System.out.println("꽝");
        }

    }



    private static void printLotto(int[] lotto) {
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i]+" ");
        }
    }


    // 오름차순 버블정렬
    private static int[] sortAscending(int[] lotto) {
        for(int i = lotto.length-1;i>0;i--)
            for(int j = 0; j<i;j++)
                if(lotto[j]>lotto[j+1]){
                    int temp = lotto[j];
                    lotto[j] = lotto[j+1];
                    lotto[j+1]=temp;
                }
        return lotto;
    }

    //중복제거

    private static int[] createArrayWithoutDuplicate(int[] lotto) {
        for (int i = 0; i < 6; i++) {
            int temp = (int) (Math.random() * 7) + 1;
            lotto[i] = temp;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                }
            }
        }
        return lotto;
    }
}
