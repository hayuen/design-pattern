package 팩토리패턴;

public interface PizzaIngredientFactory {

    // 추상 팩토리 패턴

    public Dough createDough();

    // 객체 생성시 팩토리 메서드 패턴을 이용함.
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
