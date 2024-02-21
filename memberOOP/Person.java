package memberOOP;

import java.util.Scanner;

public class Person {
    private String id;
    private String password;
    private String checkPassword;
    private String name;
    private String personNumber;
    private String phoneNumber;
    private String address;
    private String job;

    private double height;

    private double weight;


// 카우푸 지수에서 사용하는 생성자
//   public Member(double height, double weight){
//       this.height = height;
//       this.weight = weight;
//   }

// 회원가입에서 사용하는 생성자
    public Person(String id, String password, String checkPassword, String name,
                  String personNumber, String phoneNumber, String address, String job){ //public+클래스명과 동일 = 생성자
        this.id = id;
        this.password = password;
        this.checkPassword = checkPassword;
        this.name = name;
        this.personNumber = personNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;

    }

    public void setID(String id) {
        this.id = id;
    }
    public String getID() {
        return this.id;
    }

    public void setPassword (String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

    public void setCheckPassword (String checkPassword) {
        this.checkPassword = checkPassword;
    }
    public String getCheckPassword() {
        return this.checkPassword;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }
    public String getPersonNumber() {
        return this.personNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {

        return this.address;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String getJob() {

        return this.job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", checkPassword='" + checkPassword + '\'' +
                ", name='" + name + '\'' +
                ", personNumber='" + personNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
