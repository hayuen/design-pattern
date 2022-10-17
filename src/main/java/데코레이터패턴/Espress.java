package 데코레이터패턴;

public class Espress extends Beverage{
    //ConcreteComponent

    public Espress(){
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
