public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;// for future, we can use this to un-subscribe from observer side.

    public CurrentConditionDisplay( Subject weatherData ){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure){
        this.humidity = humidity;
        this.temperature = temperature;
        display();
    }
    public void display(){
        System.out.println( "Current conditions : " + temperature
                                + " F degrees and " + humidity + "% humidity");
    }
}
