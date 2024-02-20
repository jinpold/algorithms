package gradeOOP;


import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름을 입력하세요.");
        String name = sc.next();
        Person person = new Person();
        person.createKorean();
        person.createEnglish();
        person.createMath();
        person.createAvg();

        System.out.println(" ============ 성적 조회 ==============");
        System.out.println("이름: " + name);
        System.out.println("국어 점수: " + person.getKorean());
        System.out.println("영어 점수: " + person.getEnglish());
        System.out.println("수학 점수: " + person.getMath());
        System.out.println("평균 점수: " + person.getAvg());
        System.out.println(" ===================================");

    }
}