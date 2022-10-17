package 데코레이터패턴;

public class HouseBlend extends Beverage{
    //ConcreteComponent
    public HouseBlend(){
        description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
