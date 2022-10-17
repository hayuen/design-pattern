package 데코레이터패턴;

public class Whip extends CondimentDecorator {
    //ConcreteDecorator
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+ ",휘핑크림";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL){
            cost += .40;
        } else if(beverage.getSize() == Size.GRANDE){
            cost += .50;
        } else if(beverage.getSize() == Size.VENTI){
            cost += .60;
        }
        return cost;
    }
}
