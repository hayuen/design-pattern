package 전략디자인패턴;

public class MallardDuck extends Duck {

    // 추상클래스를 구현하는 클래스
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }



    public void display(){
        System.out.println("저는 물오리입니다.");
    }
}