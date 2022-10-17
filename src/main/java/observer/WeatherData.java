package observer;


import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    //=============================================주제 구현 변하지 않음.
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o ){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }


    public void notifyObservers(){
        observers.forEach (Observer -> Observer.update());{
//            observer.update(temperature, humidity, pressure);
            //푸쉬용
//            observer.update();
            //옵저버 풀용.
        }
    }

    //인스턴스 변수 선언

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
//
    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
// 풀받아오는거 옵저버가
    //기타메소드
}
