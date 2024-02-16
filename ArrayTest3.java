import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayTest3 {
    /**
     * 최적화 문제 중 최대값 구하기
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오.");

        System.out.println("시험에 응시한 학생수는 몇명입니까?");
        int student = sc.nextInt();
        String[] names = new String[student];
        int[] scores = new int[student];
        System.out.println("응시한 학생의 이름을 입력하세요.");

        for (int i = 0; i < names.length; i++){
            System.out.println("학생 이름: ");
            names[i] = sc.next();

        }
        int max = 0;
        int maxCount =  0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("점수를 입력: ");
            String num = sc.next();
            scores[i] = Integer.parseInt(num);
            if(max < scores[i]) {
                max = scores[i];
                maxCount = i;
            }
        }
        System.out.println("응시생 중에 1등 이름은 : " + names[maxCount] + " 이고, " + max + "이다.");
    }
}