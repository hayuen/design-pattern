package 전략디자인패턴;

public class MuteQuack implements QuackBehavior{

    //구현클래스
    public void quack(){
        System.out.println("삑");
    }
}
