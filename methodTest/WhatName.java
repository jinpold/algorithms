package methodTest;

import java.util.Scanner;

public class WhatName {
    static String inputName(Scanner sc){
        System.out.println("학생 이름을 입력하세요: ");
      return sc.next();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = inputName(sc);
        System.out.println("이름: " + name + " 입니다.");
    }
}
