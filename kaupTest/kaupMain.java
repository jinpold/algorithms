package kaupTest;

import java.util.Scanner;

// 카우푸지수 구하는 프로그램을 만들어주세요.
// 카우푸지수 = 체중(kg) / 신장(m) * 신장(m)
// 키 150~200 / 몸무게 30~99

public class kaupMain {
    public static void main(String[] args) {
        System.out.println("당신의 신장과 체중을 입력하세요.");

        double height = (int) (Math.random()*50) +150;
        System.out.println("신장은 : " + height + " 입니다.");
        double weight = (int) (Math.random()*69) +30;
        System.out.println("체중은 : " + weight + " 입니다.");

        double height2 = height / 100;

        System.out.println("BMI지수는: " + Math.round(weight / (height2*height2)) + " 입니다.");
    }
}

