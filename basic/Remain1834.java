package basic;

import java.util.Scanner;
public class Remain1834 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long sum = 0;

        for (int i = 0; i < num; i++) {
            sum += (num + 1) * i;
            System.out.println("sum: " +sum);
        }
        System.out.println(sum);
    }
}