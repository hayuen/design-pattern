package 전략디자인패턴;

public class FlyNoWay implements FlyBehavior{
    //구현클래스
    public void fly(){
        System.out.println("저는 못 날아요");
    }

}
