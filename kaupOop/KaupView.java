package kaupOop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KaupView {
    // 카우푸지수 구하는 프로그램을 만들어주세요.
    // 카우푸지수 = 체중(kg) / 신장(m) * 신장(m)
    // 키 150~200 / 몸무게 30~99

        // static String test; -> 필드가 아니라 상수

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("당신의 이름을 입력하세요.");
            String name = sc.next();
            Person person = new Person();
            person.createHeight();
            person.createWeight();


            KaupService service = new KaupServiceImpl();
            double bmi = service.createBmi();
            String bodyMass = service.createBodyMass();

            System.out.println("=============BMI 지수 조회 =============");
            System.out.println("이름: " + name);
            System.out.println("신장은: " + person.getHeight());
            System.out.println("체중은: " + person.getWeight());
            System.out.printf("Bmi지수는: %.1f", person.getBmi());
            System.out.println();
            System.out.println("체질량은:" + person.getBodyMass());
            System.out.println("========================================");

        }
}