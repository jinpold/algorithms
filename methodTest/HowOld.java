package methodTest;

import java.util.Scanner;

public class HowOld {

    static int intputAge(Scanner sc){
        System.out.println("나이를 입력하세요: ");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = intputAge(sc);
        System.out.println("나이: " + age + " 입니니다.");
    }
}
