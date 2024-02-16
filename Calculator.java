import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        String num1 = scanner.next();
        System.out.println("두번째 숫자를 입력하세요");
        String num2 = scanner.next();
        System.out.println("+, -, *, / 을 입력하세요");
        String opcode = scanner.next();
        int result = 0;
        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);

        if (opcode.equals("+")) {
            result = intNum1 + intNum2;

        } else if (opcode.equals("-")) {
            result = intNum1 - intNum2;

        } else if (opcode.equals("*")) {
            result = intNum1 * intNum2;

        } else if (opcode.equals("/")) {
            result = intNum1 / intNum2;

        } else {
            System.out.println("잘못된 연산기호입니다.");
        }
        System.out.println("첫번째 숫자: " + num1);
        System.out.println("두번째 숫자: " + num2);
        System.out.println("연산결과: " + result);
    }
}
