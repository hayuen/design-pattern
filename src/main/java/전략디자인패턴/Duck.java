package 전략디자인패턴;

public abstract class Duck {
    //오리라는 추상클래스
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public  Duck(){
    }

    public abstract void  display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
    }

    //set 동적허용:)
    public void  setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

}
