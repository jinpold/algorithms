package basic;

import java.util.Scanner;
public class Square1085 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();

            int minX = Math.min(x, w-x); // x축 방향 최소 거리
            int minY = Math.min(y, h-y); // y축 방향 최소 거리
            int minDistance = Math.min(minX, minY); // 최소 거리

            System.out.println(minDistance);
    }
}
