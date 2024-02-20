package memberOOP;

import java.util.Scanner;

public class MemberView {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.println("ID: ");
        String id = scanner.next();
        person.setID(id);

        System.out.println("비번: ");
        String password = scanner.next();
        person.setPassword(password);

        System.out.println("비번확인: ");
        String checkPassword = scanner.next();
        person.setCheckPassword(checkPassword);

        System.out.println("이름: ");
        String name = scanner.next();
        person.setName(name);


        System.out.println("주민번호: ");
        int personNumber = Integer.parseInt(scanner.next());
        person.setPersonNumber(personNumber);


        System.out.println("전화번호: ");
        int phoneNumber = Integer.parseInt(scanner.next());
        person.setPhoneNumber(phoneNumber);

        System.out.println("주소");
        String address = scanner.next();
        person.setAddress(address);

        System.out.println("직업");
        String job = scanner.next();
        person.setJob(job);


        System.out.println("ID: " + id);
        System.out.println("비번: " + password);
        System.out.println("비번확인: " + checkPassword);
        System.out.println("이름: " + name);
        System.out.println("주민번호: " + personNumber);
        System.out.println("전화번호: " + phoneNumber);
        System.out.println("주소: " + address);
        System.out.println("직업: " + job);

    }
}
