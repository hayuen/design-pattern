package observer;


public class CurrentConditionsDisplay implements Observer, DisplayElement{

    //현재 상태 디스플레이
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        //숙제 this 에 왜 저게들어오면안되는지
        //this 이것을 사용하면 객체의 해시키를 얻ㅇ을 수 있습니다. jvm 자바가상머신이 사용하는 참조변수 주소값이다.
        //CurrentConditionsDisplay 이자체에는 그냥 클래스 변수 명이고, 주소값은 반영되지 않았나?, 그렇다면 this로 내부에 있는 이 클래스의 주소를 지칭해줄수 있나?.
        //this 는 이 클래스의 주소를 의미한다. 디스뒤에 점이 붙으면 그 안에 변수들을 사용할 수 있는 것도 그 때문. 주소안의 값을 찾아주기 때문에.
        //클래스 명은 클래스의 명칭이지 주소값이 아니라서 들어가도 성립이 되지않는다?... 라고 생각되네요;

    }

//    public void update(float temperature, float humidity, float pressure){
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();
//    }
// ===================================================================== 주제가 push하는 코드

    public void update(){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
    public void display(){
        System.out.println("현재 상태: 온도" + temperature + "F, 습도 " + humidity + "&");
    }


}
