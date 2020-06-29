package proxypattern.protectionpattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WeatherForecastWriter implements InvocationHandler {

    public WeatherForecast weatherForecast;

    public WeatherForecastWriter(WeatherForecast weatherForecast){
        this.weatherForecast = weatherForecast;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().startsWith("set")){
            return method.invoke(weatherForecast, args);
        } else if (method.getName().startsWith("get")){
            throw new IllegalAccessException();
        }
        return null;
        //return method.invoke(weatherForecast, args);
    }
}
