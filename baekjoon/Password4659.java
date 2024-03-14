package baekjoon;

import java.util.Scanner;
public class Password4659 {
    /*
    문제 :
    좋은 패스워드를 만드는것은 어려운 일이다. 대부분의 사용자들은 buddy처럼 발음하기 좋고 기억하기 쉬운 패스워드를 원하나, 이런 패스워드들은 보안의 문제가 발생한다.
    어떤 사이트들은 xvtpzyo 같은 비밀번호를 무작위로 부여해 주기도 하지만, 사용자들은 이를 외우는데 어려움을 느끼고 심지어는 포스트잇에 적어 컴퓨터에 붙여놓는다.
    가장 이상적인 해결법은 '발음이 가능한' 패스워드를 만드는 것으로 적당히 외우기 쉬우면서도 안전하게 계정을 지킬 수 있다.
    회사 FnordCom은 그런 패스워드 생성기를 만들려고 계획중이다. 당신은 그 회사 품질 관리 부서의 직원으로 생성기를 테스트해보고 생성되는 패스워드의 품질을 평가하여야 한다.
    높은 품질을 가진 비밀번호의 조건은 다음과 같다.
    1. 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
    2. 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
    3. 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
    이 규칙은 완벽하지 않다;우리에게 친숙하거나 발음이 쉬운 단어 중에서도 품질이 낮게 평가되는 경우가 많이 있다.

    입력 요구 사항 :
    1. 입력은 여러개의 테스트 케이스로 이루어져 있다.
    2. 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 테스트할 패스워드가 주어진다.
    3. 마지막 테스트 케이스는 end이며, 패스워드는 한글자 이상 20글자 이하의 문자열이다. 또한 패스워드는 대문자를 포함하지 않는다.

    출력 요구 사항 :
    1. 각 테스트 케이스를 '예제 출력'의 형태에 기반하여 품질을 평가하여라.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String password = sc.next();
            if (password.equals("end")) {
                break;
            }

            if (isValidPassword(password)) {
                System.out.println("<" + password + "> is acceptable.");
            } else {
                System.out.println("<" + password + "> is not acceptable.");
            }
        }

        sc.close();
    }

    private static boolean isValidPassword(String password) {
        boolean hasVowel = false;
        for (char c : password.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                hasVowel = true;
                break;
            }
        }
        if (!hasVowel) {
            return false;
        }

        for (int i = 0; i < password.length() - 2; i++) {
            char c1 = password.charAt(i);
            char c2 = password.charAt(i + 1);
            char c3 = password.charAt(i + 2);
            if ((c1 == c2 && c2 == c3) ||
                    (isVowel(c1) && isVowel(c2) && isVowel(c3)) ||
                    (!isVowel(c1) && !isVowel(c2) && !isVowel(c3))) {
                return false;
            }
        }

        for (int i = 0; i < password.length() - 1; i++) {
            char c1 = password.charAt(i);
            char c2 = password.charAt(i + 1);
            if (c1 == c2 && c1 != 'e' && c1 != 'o') {
                return false;
            }
        }

        return true;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}