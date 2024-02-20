package gradeOOP;

import java.util.Scanner;

public class Person {

    private String name;
    private int korean;
    private int english;
    private int math;
    private int avg;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void createKorean(){
        this.korean = (int)(Math.random()* 100)+0;
    }
    public int getKorean() {
        return this.korean;
    }

    public void createEnglish(){
        this.english = (int)(Math.random()* 100)+0;
    }

    public int getEnglish() {
        return this.english;
    }
    public void createMath(){
        this.math = (int)(Math.random()* 100)+0;
    }
    public int getMath() {
        return this.math;
    }
    public void createAvg(){
        this.avg = (korean + english + math) / 3;
    }
    public int getAvg() {
        return this.avg;
    }

}
