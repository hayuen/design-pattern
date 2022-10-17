package 전략디자인패턴;

public class ModelDuck extends Duck{

    // 추상클래스를 구현하는 클래스
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("저는 모형 오리입니다.");
    }

}
