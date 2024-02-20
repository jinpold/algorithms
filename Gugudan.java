import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 수행할 2~9의 숫자중 하나를 입력하세요");
        int number = sc.nextInt();
        for (int i = 0; i < 9; i++) {
            System.out.println(number + " * "+ (i+1) + " = " + number*(i+1));
        }
    }
}
