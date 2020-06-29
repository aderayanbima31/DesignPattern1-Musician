package proxypattern.virtualproxy;

public class WeatherForecast implements NewsContract {
    @Override
    public void init() {
        System.out.println("Init DONE");
    }

    @Override
    public void showNews() {
            System.out.println("Today's weather forecast - cloudy with light rain");
    }
}
