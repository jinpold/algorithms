package baekjoon;

import java.util.Scanner;
public class BulbSwitch2138 {
    /*
     문제 :
     N개의 스위치와 N개의 전구가 있다. 각각의 전구는 켜져 있는 상태와 꺼져 있는 상태 중 하나의 상태를 가진다.
     i(1 < i < N)번 스위치를 누르면 i-1, i, i+1의 세 개의 전구의 상태가 바뀐다. 즉, 꺼져 있는 전구는 켜지고, 켜져 있는 전구는 꺼지게 된다.
     1번 스위치를 눌렀을 경우에는 1, 2번 전구의 상태가 바뀌고, N번 스위치를 눌렀을 경우에는 N-1, N번 전구의 상태가 바뀐다.
     N개의 전구들의 현재 상태와 우리가 만들고자 하는 상태가 주어졌을 때, 그 상태를 만들기 위해 스위치를 최소 몇 번 누르면 되는지 알아내는 프로그램을 작성하시오.

     입력 요구 사항 :
     1. 첫째 줄에 자연수 N(2 ≤ N ≤ 100,000)이 주어진다.
     2. 다음 줄에는 전구들의 현재 상태를 나타내는 숫자 N개가 공백 없이 주어진다.
     3. 그 다음 줄에는 우리가 만들고자 하는 전구들의 상태를 나타내는 숫자 N개가 공백 없이 주어진다.
     4. 0은 켜져 있는 상태, 1은 꺼져 있는 상태를 의미한다.

     출력 요구 사항 :
     1. 첫째 줄에 답을 출력한다.
     2. 불가능한 경우에는 -1을 출력한다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans1 = 1, ans2 = 0, INF = 987654321;

        String now = sc.next();
        String expect = sc.next();

        int[] now_arr_1 = new int[n];
        int[] now_arr_2 = new int[n];
        int[] expect_arr = new int[n];

        for(int i = 0; i < n; i++) {
            now_arr_1[i] = now.charAt(i)-'0';
            now_arr_2[i] = now.charAt(i)-'0';
            expect_arr[i] = expect.charAt(i)-'0';
        }
        now_arr_1[0] = 1-now_arr_1[0];
        now_arr_1[1] = 1-now_arr_1[1];

        for(int i = 1; i < n; i++) {
            if(now_arr_1[i-1] != expect_arr[i-1]) {
                now_arr_1[i-1] = 1 - now_arr_1[i-1];
                now_arr_1[i] = 1 - now_arr_1[i];
                ans1++;
                if(i != n-1)
                    now_arr_1[i+1] = 1 - now_arr_1[i+1];

            }
            if(now_arr_2[i-1] != expect_arr[i-1]) {
                now_arr_2[i-1] = 1 - now_arr_2[i-1];
                now_arr_2[i] = 1 - now_arr_2[i];
                ans2++;
                if(i != n-1)
                    now_arr_2[i+1] = 1 - now_arr_2[i+1];
            }
        }

        if(now_arr_1[n-1] != expect_arr[n-1]) ans1 = INF;
        if(now_arr_2[n-1] != expect_arr[n-1]) ans2 = INF;


        if(ans1 == INF && ans2 == INF)
            System.out.println(-1);
        else
            System.out.println(Math.min(ans1, ans2));
    }
}
