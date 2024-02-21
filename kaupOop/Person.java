package kaupOop;

public class Person {
    private String name; //  인스턴스 필드
    private double height; // 데이터값
    private double weight;
    private double bmi;
    private String bodyMass;

    public void createHeight() {
        // public static void <- static이 없으면
        // 인스턴스 메소드
        this.height = (int)(Math.random()*50)+150;
    }
    public double getHeight() {
        return this.height;
    }

    public void createWeight() {

        this.weight = (int)(Math.random()*69)+30;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getBmi() {

        return this.bmi;
    }

    public String getBodyMass() {

        return this.bodyMass;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    public void createBmi() { // 시스템이 내부에서 진행
        this.bmi = weight / ((height / 100) * (height / 100));
    }

    public void createBodyMass() {
        String bodyMass = "";
        if (bmi < 18.5) {
            bodyMass = "저체중";
        } else if (bmi < 23) {
            bodyMass = "정상";
        } else if (bmi < 25) {
            bodyMass = "과체중";
        } else if (bmi > 25)
            bodyMass = "비만";
        this.bodyMass =bodyMass;
    }
}