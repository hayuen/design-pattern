package 데코레이터패턴;

public abstract class CondimentDecorator extends Beverage{
    //데코레이터 클래스
    Beverage beverage;
    // 감쌀 음료 지정


    public abstract String getDescription();

    //모든 첨가물 데코레이터에 getDescription() 메소드를 사용하기위해서

    public Size getSize(){
        return beverage.getSize();
    }
}
