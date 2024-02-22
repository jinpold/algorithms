package methodTest;

import java.util.Scanner;

public class GugudanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 수행할 2~9의 숫자중 하나를 입력하세요.");
        int num = sc.nextInt();
        int[] arr = new int[10];
        int result = 0;

        for (int i = 1; i < arr.length; i++) {

            arr[i] = i;
            //arr[i]; 만 했을땐 0만 찍혔고, = i; 해줘야 1~9까지 돌아감
            //이유는 전자는 단순히 null값을
            result = arr[i] * num;
            System.out.println(num + "*" + i + "=" + result);
        }
    }
}
