package 팩토리패턴;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;


    abstract void prepare();

    void bake() {
        System.out.println("175도에서 25분간 굽기");
    }

    void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    void box() {
        System.out.println("상자를 피자 담기");
    }

    void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        //피자 이름을 출력하는 부분
        return null;
    }



}
