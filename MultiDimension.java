import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 두개 반의 평균 점수를 구하시오.");
        System.out.println("1반에서 시험 응시한 학생수는 몇명입니까?");
        int numberOfStudent1 = sc.nextInt();
        String[] studentName1 = new String[numberOfStudent1];

        System.out.println("2반에서 시험 응시한 학생수는 몇명입니까?");
        int numberOfStudent2 = sc.nextInt();
        String[] studentName2 = new String[numberOfStudent2];

        int[] scores1 = new int[numberOfStudent1];
        int[] scores2 = new int[numberOfStudent2];

        System.out.println("1반의 평균 점수를 구하시오. ");
        int avg1 = 0;
        int max1 = 0;

        for (int i = 0; i < scores1.length; i++) {
            System.out.println(i+1 + " 번째 랜덤값을 적용합니다.");
            scores1[i] = (int)(Math.random()*100);
            System.out.println(scores1[i]);
            avg1 += scores1[i];
            if(max1 < scores1[i]){
                max1 = scores1[i];
            }
        }

        System.out.println("2반의 평균 점수를 구하시오. ");

        int avg2 = 0;
        int max2 = 0;
        for (int i = 0; i < scores2.length; i++) {
            System.out.println(i+1 + " 번째 랜덤값을 적용합니다.");
            scores2[i] = (int)(Math.random()*100);
            System.out.println(scores2[i]);
            avg2 += scores2[i];
            if(max2 < scores2[i]){
                max2 = scores2[i];
            }

        }
        System.out.println("1반의 평균 점수: " + avg1 /scores1.length + "이고" + " 최고 점수는: " + max1 + "입니다.");
        System.out.println("2반의 평균 점수: " + avg2 /scores1.length + "이고" + " 최고 점수는: " + max2 + "입니다.");
    }
}


