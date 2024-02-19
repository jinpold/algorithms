package methodTest;

public class WhatName2 {
    static String returnName(String lastName){
      return "에릭" + " " + lastName;
    }
    public static void main(String[] args) {
        String lastName = "감마";
        String name = returnName(lastName);
        System.out.println("이름: " + name + " 입니다.");
    }
}
