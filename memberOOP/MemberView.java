package memberOOP;

import java.util.Scanner;

public class MemberView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력");
        Person person = new Person(sc.next(), sc.next(), sc.next(), sc.next(),
                sc.next(), sc.next(), sc.next(), sc.next());

        System.out.println(person. toString());
    }
}
