package baekjoon;

import java.util.Scanner;

public class Changes5585 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {500, 100, 50, 10, 5, 1};
        int money = 1000 - sc.nextInt();
        int count = 0;

        int coin = 0;
        while (money != 0) {
            int changes = money / arr[coin];
            money -= changes * arr[coin++];
            count += changes;
        }
        System.out.println(count);
    }
}
