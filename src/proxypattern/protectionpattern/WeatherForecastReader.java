package proxypattern.protectionpattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WeatherForecastReader implements InvocationHandler {

    public WeatherForecast weatherForecast;

    public WeatherForecastReader(WeatherForecast weatherForecast) {
        this.weatherForecast = weatherForecast;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().startsWith("get")){
            return method.invoke(weatherForecast, args);
        } else if (method.getName().startsWith("set")){
            throw new IllegalAccessException();
        }
        return null;
    }
}
