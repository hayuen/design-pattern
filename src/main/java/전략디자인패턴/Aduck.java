package 전략디자인패턴;

public class Aduck extends Duck{

    public Aduck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();

    }
    public void display(){}
}