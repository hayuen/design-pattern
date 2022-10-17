package 데코레이터패턴;

import java.awt.*;

public abstract class Beverage {
    //Component

    public  enum Size{TALL, GRANDE, VENTI};
    Size size =Size.TALL;
    String description = "제목 없음";

    public String getDescription(){
        return description;
    }

    public void setSize(Size size){
        this.size =size;
    }

    public Size getSize(){
        return this.size;
    }

    public abstract double cost();

}
