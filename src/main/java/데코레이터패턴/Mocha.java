package 데코레이터패턴;

public class Mocha extends CondimentDecorator{
    //ConcreteDecorator

    // 상속받은 클래스인데 Beverage정보가 있어서 바로 this로 지정이 가능한가보다.
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+ ",모카";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL){
            cost += .20;
        } else if(beverage.getSize() == Size.GRANDE){
            cost += .40;
        } else if(beverage.getSize() == Size.VENTI){
            cost += .60;
        }
        return cost;
    }

}
