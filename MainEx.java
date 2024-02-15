import java.util.Scanner;

public class MainEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 소문자 스캐너(이름)
        System.out.println("ID: ");
        String ID = scanner.next();
        System.out.println("비번: ");
        String password = scanner.next();
        System.out.println("비번확인: ");
        String checkPassword = scanner.next();
        System.out.println("이름: ");
        String name = scanner.next();
        System.out.println("주민번호: ");
        String personNumber = scanner.next();
        System.out.println("전화번호: ");
        String phoneNumber = scanner.next();
        System.out.println("주소");
        String address = scanner.next();
        System.out.println("직업");
        String job = scanner.next();


        System.out.println("ID: " + ID);
        System.out.println("비번: " + password);
        System.out.println("비번확인: " + checkPassword);
        System.out.println("이름: " + name);
        System.out.println("주민번호: " + personNumber);
        System.out.println("전화번호: " + phoneNumber);
        System.out.println("주소: " + address);
        System.out.println("직업: " + job);

    }
}
