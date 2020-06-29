package proxypattern.protectionpattern;

public class WeatherForecastContent implements WeatherForecast {

    String weatherForcastContent;

    public WeatherForecastContent(String weatherForcastContent) {
        this.weatherForcastContent = weatherForcastContent;
    }

    @Override
    public String getWeatherForecastContent() {
        return weatherForcastContent;
    }

    @Override
    public void setWeatherForecastContent(String weatherForecastContent) {
        this.weatherForcastContent = weatherForecastContent;
    }
}
