package proxypattern.protectionpattern;

import java.lang.reflect.Proxy;

public class WeatherForcastAccess {

    public static WeatherForecast getForecastWriter(WeatherForecast weatherForecast){
        return (WeatherForecast) Proxy.newProxyInstance(
                weatherForecast.getClass().getClassLoader(),
                weatherForecast.getClass().getInterfaces(),
                new WeatherForecastWriter(weatherForecast));
    }

    public static WeatherForecast getForecastReader(WeatherForecast weatherForecast){
        return (WeatherForecast) Proxy.newProxyInstance(
                weatherForecast.getClass().getClassLoader(),
                weatherForecast.getClass().getInterfaces(),
                new WeatherForecastReader(weatherForecast));
    }
}
