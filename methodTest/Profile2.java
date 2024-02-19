package methodTest;

import java.util.Scanner;

public class Profile2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = WhatName.inputName(sc);
        int age = HowOld.intputAge(sc);
        System.out.printf("이름 : %s + 나이: %d", name, age);
    }
}
