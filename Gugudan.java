import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < 9; i++) {
            System.out.println(number + " * "+ (i+1) + " = " + number*(i+1));
        }
    }
}
