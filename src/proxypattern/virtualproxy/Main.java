package proxypattern.virtualproxy;

public class Main {

    public static void main(String[] args) {
        WeatherForecastProxy weatherForecastProxy = new WeatherForecastProxy();
        weatherForecastProxy.init();
        weatherForecastProxy.showNews();
        weatherForecastProxy.init();
    }
}
