package 전략디자인패턴;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();


        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        Duck aduck = new Aduck();
        aduck.performFly();
        aduck.performQuack();

    }



    //실행
}
