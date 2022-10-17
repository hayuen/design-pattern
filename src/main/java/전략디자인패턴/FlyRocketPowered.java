package 전략디자인패턴;

public class FlyRocketPowered implements FlyBehavior{

    //구현클래스
    public void fly(){
        System.out.println("로켓 추진으로 날아갑니다");
    }
}
