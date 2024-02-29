package baekjoon;

import java.util.Scanner;

public class Changes {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int [] arr = {500,100,50,10,5,1};	// 엔화 배열 선언
        int money = 1000 - sc.nextInt();	// 잔돈
        int Changes = 0;

        int idx = 0 ;
        while(money != 0)		// 잔돈이 0이 될 때까지 반복
        {
            int change = money / arr[idx];	// 잔돈을 엔화의 종류별로 나누어 변수에 저장
            money -= change * arr[idx++];	// 동전의 종류로 나누고 난 나머지를 잔돈에 저장
            Changes += change;					      // 나눈 몫을 동전의 개수 변수인 coin에 저장
        }

        System.out.println(Changes+ "");


    }
}



