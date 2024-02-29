package matrixTest;

import java.util.Random;
import java.util.Scanner;

/**
 1. 서로 겹치지 않는 숫자 6개를 생성
 2. 각 숫자는 1 ~ 45 범위 내의 숫자
 3. 매번 실행 시 다른 숫자 출력
 4. 오름차순 정렬
 -> 랜덤수 : Math 사용
 결과)
 ----------------
 로또 번호
 ----------------
 2 11 25 27 35 38
 * */

public class LottoBuy {

    public static void main(String[] args) {
        System.out.println("로또 번호 8개를 입력하세요 ");
        IBuyLotto buy = new BuyLotto();
        ILottoDraw draw = new LottoDraw();
        ILottoMatch match = new LottoMatch();


        int[] myLotto = buy.buyLotto();
        myLotto = draw.sortAscending(myLotto);
        System.out.println("\n    나의 로또 번호");
        draw.printLotto(myLotto);
        System.out.println("");
        System.out.println("\n======추첨중입니다======");


        int[] originLotto = new int[6];
        originLotto = draw.createArrayWithoutDuplicates(originLotto);
        originLotto = draw.sortAscending(originLotto);

        System.out.println("\n    로또 추첨 번호");
        draw.printLotto(originLotto);
        System.out.println("");
        int num = match.findSame(myLotto, originLotto);
        System.out.println("\n      당첨 결과");
        System.out.println("         "+match.rank(num));

    }
}
interface IBuyLotto{int[] buyLotto();}

interface ILottoDraw{
    int createRandomNumber(int start, int end);
    int[] createArrayWithoutDuplicates(int[] arr);
    int[] sortAscending(int[] arr);
    void printLotto(int[] arr);
}
interface ILottoMatch{
    int findSame(int[] myLotto, int[] originLotto);
    String rank(int num);
}
class BuyLotto implements IBuyLotto {

    @Override
    public int[] buyLotto() {
        Scanner sc = new Scanner(System.in);
        int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = sc.nextInt();

        }
        return lotto;
    }
}

class LottoDraw implements ILottoDraw{

    @Override
    public void printLotto(int[] arr) {
        for(int i =0; i< arr.length; i++){
            System.out.printf("%d \t", arr[i]);
        }
    }

    @Override
    public int[] sortAscending(int[] arr) {
        // 버블 정렬이 들어갈 부분
        for(int i=0; i< arr.length;i++){
            for(int j=0; j < arr.length -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    @Override
    public int[] createArrayWithoutDuplicates(int[] arr) {
        for (int i = 0; i < 6; i++) {
            int temp = (int) (Math.random() * 7) + 1;
            arr[i] = temp;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }
        return arr;
    }

    @Override
    public int createRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(end)+start;
    }

}


class LottoMatch implements ILottoMatch {

    @Override
    public int findSame(int[] originLotto, int[] myLotto) {
        // 번호 비교
        int num = 0;
        for (int i = 0; i < myLotto.length; i++) {
            for (int j = 0; j < originLotto.length; j++) {
                if (myLotto[i] == originLotto[j]) {
                    num += 1;
                }
            }
        } return num;
    }
    @Override
    public String rank (int num){
        String rank = "";
        switch (num) {
                case 6:
                    rank = "1등";
                    break;
                case 5:
                    rank = "2등";
                    break;
                case 4:
                    rank = "3등";
                    break;
                case 3:
                    rank = "4등";
                    break;
                case 2, 1, 0:
                    rank = "꽝";
                    break;
            }
            return rank;
        }

    }

