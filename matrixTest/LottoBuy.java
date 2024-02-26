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
        Scanner sc = new Scanner(System.in);
        System.out.println("로또 번호 8개를 입력하세요 ");
        IBuyLotto buy = new BuyLotto();
        ILottoDraw draw = new LottoDraw();
        ILottoMatch match = new LottoMatch();

        int[] arr1 = new int[6];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        arr1 = draw.sortAscending(arr1);
        draw.printLotto(arr1);
        System.out.println("");
        System.out.println("======..추첨중입니다..======");

        // 로또 구입

//        int[] arr1 = new int[6];
//        arr1 = draw.createArrayWithoutDuplicates(arr1);
//        arr1 = draw.sortAscending(arr1);
//        draw.printLotto(arr1);
//        System.out.println("");
//        System.out.println("");

        int[] arr2 = new int[6];
        arr2 = draw.createArrayWithoutDuplicates(arr2);
        arr2 = draw.sortAscending(arr2);
        draw.printLotto(arr2);
        System.out.println("");
        // 구입한 로또와 추첨한 로또의 일치여부 체크

        // 번호 비교
        int num = 0;
        System.out.println("");
        System.out.print("당첨 결과는 : ");
        for (int i=0;i< arr1.length;i++){
            for(int j=0; j< arr2.length;j++) {
                if (arr1[i] != arr2[j]) {

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
}
interface IBuyLotto{ int[] buyLotto();}
interface ILottoDraw{
    int createRandomNumber(int start, int end);
    int[] createArrayWithoutDuplicates(int[] arr);
    int[] sortAscending(int[] arr);
    void printLotto(int[] arr);
}
interface ILottoMatch{
    int findSame(int[] originLotto, int[] myLotto);
    String rank(int count);
}
class BuyLotto implements IBuyLotto{

    @Override
    public int[] buyLotto() {
        return new int[0];
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
        for(int i=0; i<6; i++){
            int randomNumber = createRandomNumber(1,8);
            boolean check = false;
            for(int j=0; j<6; j++){
                if(arr[j] == randomNumber){
                    // 중복되면  check 를 true 로 바꿔라..
                    check = true;
                }
            }
            if(check==false){
                arr[i] = randomNumber; // 중복되지 않았으니 배열에 담아라.
            }else{
                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
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
class LottoMatch implements ILottoMatch{
    @Override
    public int findSame(int[] originLotto, int[] myLotto){
        return 0;
    }

    @Override
    public String rank(int count) {
        return null;
    }
}

