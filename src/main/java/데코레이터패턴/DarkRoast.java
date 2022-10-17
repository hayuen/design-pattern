package 데코레이터패턴;

public class DarkRoast extends Beverage {
    //ConcreteComponent

    public DarkRoast(){
        description = "다크로스트";
    }

    @Override
    public double cost() {
        return .99;
    }

}
