import java.util.Scanner;

public class ArrayTest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오.");

        //학생 수 입력받기
        System.out.println("시험에 응시한 학생수는 몇명입니까?");
        int studentNum = scanner.nextInt();
        int[] score = new int[studentNum];
        String[] studentName = new String[studentNum];

        //응시 데이터 입력받기
        for(int i = 0; i<studentNum; i++) {
            System.out.println(i+1 + " 번째 학생의 이름과 점수를 입력하세요.");
            studentName[i] = scanner.next();
            score[i] = scanner.nextInt();
        }

        System.out.println("총 " + studentNum+ " 명 응시하였습니다.");

        System.out.println("응시명단 : ");

        //결과
        int max = 0;
        String bestName = "";
        for(int i = 0; i<score.length; i++){
            System.out.println(i+1 + ", " +studentName[i]+ "학생, 점수 : " +score[i]);
            if(max < score[i]){
                max = score[i];
                bestName = studentName[i];
            }else{}
        }
        System.out.println("1등 " +bestName+ ", 점수는 " +max+ " 점입니다." );
    }
}
