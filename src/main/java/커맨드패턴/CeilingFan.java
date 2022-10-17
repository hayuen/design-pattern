package 커맨드패턴;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        // 선풍기 속도를 HIGH로 맞추는 코드
    }

    public void medium(){
        speed= MEDIUM;
        // 선풍기 속도를 MEDIUM으로 맞추는 코드
    }

    public void low(){
        speed = LOW;
    }

    public void off(){
        speed = OFF;
    }

    public int getSpeed(){
        return speed;
    }

}
