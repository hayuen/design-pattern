package observer;

import java.util.Observable;

public class ForecastDisplay implements Observer, DisplayElement {

    //기상상태
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

//    public void update(float temp, float humidity, float pressure) {
//        lastPressure = currentPressure;
//        currentPressure = pressure;
//
//        display();
//    }

    //push용

    public void update(){
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();

        display();
    }
// pull용

    public void display() {
        System.out.print("기상 예보: ");
        if (currentPressure > lastPressure) {
            System.out.println("날씨가 좋아지고 있어요!");
        } else if (currentPressure == lastPressure) {
            System.out.println("지금과 비슷할 것 같습니다.");
        } else if (currentPressure < lastPressure) {
            System.out.println("쌀쌀하며 비가 올 것 같습니다.");
        }
    }

}