package methodTest;

import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = WhatName.inputName(sc);
        int age = HowOld.intputAge(sc);
        System.out.println("이름: " + name + " 나이: " + age + " 입니다.");
    }
}


// 이름과 나이가 나눠져 있는 클래스를