package basic;

import java.util.Scanner;

public class Sum01 {
    public static void main(String[] args) {
            int a, b, sum;
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            sum = a + b;
            System.out.println(sum);
    }
}

